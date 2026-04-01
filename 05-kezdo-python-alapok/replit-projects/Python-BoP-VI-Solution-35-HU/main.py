def check_email_format(email):
  if email.count('@') == 1:
    print('Az e-mail-cím formátuma megfelelő.')
  else:
    print('Az e-mail-cím formátuma nem megfelelő.')

check_email_format('bela.kovacs@@pelda.hu')