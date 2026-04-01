def write_favorite_characters_into_a_file(file_name):
  characters = input('Kik a kedvenc karaktereid? Írd be őket vesszővel elválasztva: ')
  character_list = characters.split(', ')
  file = open(file_name, 'w')
  for character in character_list:
    file.write(character + '\n')
  file.close()

write_favorite_characters_into_a_file('characters.txt')