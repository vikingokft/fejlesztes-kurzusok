import file_handler

video_game_sales = list(file_handler.get_dicts_from_csv('vg_sales.csv'))

def get_sales_keys(sales):
  sales_keys = []
  for key in sales[0].keys():
    if 'Sales' in key:
      sales_keys.append(key)
  return sales_keys

sales_keys = get_sales_keys(video_game_sales)

def modify_sales_numbers(sales):
  sales_keys = get_sales_keys(sales)
  for sale in sales:
    for sale_key in sales_keys:
      sale[sale_key] = float(sale[sale_key])
  return sales

video_game_sales = modify_sales_numbers(video_game_sales)