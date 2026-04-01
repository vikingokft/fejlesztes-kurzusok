def get_chosen_number(numbers, index):
  try:
    chosen_number = numbers[index]
  except IndexError:
    print('Sajnos a megadott index nem létezik a listában.')
  else:
    print('A választott szám: ' + str(chosen_number))
  finally:
    print('A program sikeresen lefutott.')

numbers = [1, 2, 3, 4, 5]
index = int(input('Hányadik számot választod a listából? '))
get_chosen_number(numbers, index)