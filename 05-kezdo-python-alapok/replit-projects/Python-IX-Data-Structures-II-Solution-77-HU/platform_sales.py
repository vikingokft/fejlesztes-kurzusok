import data_conversion
import file_handler
import platform_sales

test_video_game_sales = data_conversion.modify_sales(file_handler.get_dicts_from_csv('vg_sales.csv')[:3])
print(platform_sales.create_platform_sales(platform_sales.get_gamesales_by_platforms(test_video_game_sales), data_conversion.get_sales_keys(test_video_game_sales)))
