def recipe_reader(file_name):
  recipe_file = open(file_name)
  ingredients = []
  for line in recipe_file:
    ingredients.append(line.strip())
  recipe_file.close()
  return ingredients

print(recipe_reader('recipe.txt'))