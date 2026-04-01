import csv

phones = [
  {'brand_name': 'Apple', 'model_name': 'iPhone 12', 'os': 'iOS'},
  {'brand_name': 'Samsung', 'model_name': 'Galaxy S21', 'os': 'Android'}
]

csvfile = open('phones_output.csv', 'w')
fieldnames = tuple(phones[0].keys())
writer = csv.DictWriter(csvfile, fieldnames)
writer.writeheader()
for phone in phones:
  writer.writerow(phone)
csvfile.close()