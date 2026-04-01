lecso = {
  'paradicsom': '40 dkg',
  'paprika': '80 dkg',
  'hagyma': '2 fej',
  'só': 'ízlés szerint',
  'olaj': '2 evőkanál'
}

print(lecso.get('paradicsom'))
print(lecso.get('cukor', 'Ez az összetevő nem szerepel a receptben.'))