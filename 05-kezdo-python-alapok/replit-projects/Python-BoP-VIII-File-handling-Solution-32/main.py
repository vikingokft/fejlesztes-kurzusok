numbers = [1, 2, 3, 4, 5]

try:
  print(numbers[10])
except IndexError:
  print('Hiba: Az index kívül esik a lista tartományán!')