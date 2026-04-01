recipe_book = {
  'lecsó' : {
    'paradicsom': '40 dkg',
    'paprika': '80 dkg',
    'vöröshagyma': '2 fej',
    'só': 'ízlés szerint'
  },
  'pörkölt' : {
    'hús': '50 dkg',
    'vöröshagyma': '3 fej',
    'pirospaprika': '1 evőkanál',
    'só': 'ízlés szerint'
  }
}

for ingredient, amount in recipe_book['pörkölt'].items():
  print('A ' + str(ingredient) + ' mennyisége: ' + str(amount))