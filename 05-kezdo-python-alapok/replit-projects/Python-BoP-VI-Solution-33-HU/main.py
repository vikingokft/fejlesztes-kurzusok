def check_phone_length(phone_number):
  if len(phone_number) == 12:
    print('A telefonszám hossza megfelelő.')
  else:
    print('A telefonszám hossza nem megfelelő.')

check_phone_length('+36101234567')