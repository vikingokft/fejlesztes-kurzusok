def check_phone_country(phone_number):
  if phone_number.startswith('+36'):
    print('A telefonszám országkódja megfelelő.')
  else:
    print('A telefonszám országkódja nem megfelelő.')

check_phone_country('+36101234567')