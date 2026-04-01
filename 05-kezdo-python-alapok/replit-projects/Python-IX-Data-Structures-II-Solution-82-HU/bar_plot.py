import pandas as pd
import matplotlib.pyplot as plt

data = pd.read_csv('platform_sales.csv')
sorted_data = data.sort_values(by=['Global_Sales'], ascending=False)

platforms = sorted_data['Platform'][:5]
sales = sorted_data['Global_Sales'][:5]

plt.bar(platforms, sales)
plt.show()