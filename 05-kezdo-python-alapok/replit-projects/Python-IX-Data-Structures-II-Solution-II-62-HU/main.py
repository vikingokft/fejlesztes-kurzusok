import csv

file = open('phones.csv')
file_content = csv.DictReader(file)

for row in file_content:
  print(row)

file.close()