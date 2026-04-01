import file_handler
import platform_sales

test_video_game_sales = file_handler.get_dicts_from_csv('vg_sales.csv')[:3]
print(platform_sales.get_all_platforms(test_video_game_sales))
print(platform_sales.get_gamesales_by_platforms(test_video_game_sales))
