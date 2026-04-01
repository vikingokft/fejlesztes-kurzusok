import csv

def read_file(file_name):
  csv_list = []
  file = open(file_name)
  file_content = csv.reader(file)
  for row in file_content:
    csv_list.append(row)
  file.close()
  return csv_list

print(read_file('lakers_heats_final.csv'))