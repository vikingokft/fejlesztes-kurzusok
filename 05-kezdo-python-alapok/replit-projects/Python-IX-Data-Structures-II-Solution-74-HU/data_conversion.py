test_video_game_sales = file_handler.get_dicts_from_csv('vg_sales.csv')[:3]
print(data_conversion.get_sales_keys(test_video_game_sales))
print(data_conversion.modify_sales_numbers(test_video_game_sales))
