import data_conversion

def get_all_platforms(sales):
  platforms = set()
  for sale in sales:
    platforms.add(sale['Platform'])
  return platforms

def get_gamesales_by_platforms(sales):
  platforms = get_all_platforms(sales)
  all_platforms = []
  for platform in platforms:
    sales_list = []
    for sale in sales:
      if sale['Platform'] == platform:
        sales_list.append(sale)
    all_platforms.append({platform: sales_list})
  return tuple(all_platforms)

def sum_gamesales_by_territory(sales, territory):
  sum = 0
  for sale in sales:
    sum = sum + sale[territory]
  return round(sum, 2)

def sum_platform_sales(platform_sale_items, sales_keys):
  sum_sales_by_platform = {}
  for platform, sales in platform_sale_items:
    sum_sales_by_platform['Platform'] = platform
    for key in sales_keys:
      sum_sales_by_platform[key] = sum_gamesales_by_territory(sales, key)
  return sum_sales_by_platform

def create_platform_sales(platform_sales, sales_keys):
  sum_platform_sales_list = []
  for platform_sale in platform_sales:
    sum_sales_by_platform = sum_platform_sales(platform_sale.items(), sales_keys)
    sum_platform_sales_list.append(sum_sales_by_platform)
  return sum_platform_sales_list

platform_sales_list = create_platform_sales(get_gamesales_by_platforms(data_conversion.video_game_sales), data_conversion.sales_keys)