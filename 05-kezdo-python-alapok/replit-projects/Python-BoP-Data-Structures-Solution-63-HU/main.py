lakers_players = (('A. Davis', 3), ('L. James', 23), ('D. Green', 14), ('K. Caldwell-Pope', 1), ('A. Caruso', 4), ('M. Morris', 88), ('J. Dudley', 10), ('K. Kuzma', 0), ('D. Howard', 39), ('R. Rondo', 9), ('Q. Cook', 28), ('J. McGee', 7), ('J. Smith', 21))

lakers_final_game = ((1, 2, 3), (1, 2, 23), (1, 2, 23), (1, 1, 1), (1, 1, 1), (1, 3, 14), (1, 2, 23), (1, 2, 9), (1, 2, 1), (1, 2, 3), (1, 2, 9), (1, 2, 3), (1, 2, 3), (1, 2, 23), (1, 1, 23), (2, 2, 9), (2, 3, 9), (2, 2, 23), (2, 3, 88), (2, 2, 4), (2, 2, 9), (2, 2, 9), (2, 2, 3), (2, 2, 1), (2, 1, 1), (2, 1, 3), (2, 1, 3), (2, 1, 3), (2, 2, 3), (2, 2, 1), (2, 2, 4), (2, 3, 1), (2, 3, 1), (3, 2, 23), (3, 3, 14), (3, 2, 23), (3, 2, 14), (3, 2, 1), (3, 2, 0), (3, 2, 23), (3, 3, 9), (3, 2, 23), (3, 3, 9), (4, 3, 14), (4, 2, 3), (4, 1, 3), (4, 1, 3), (4, 3, 23), (4, 2, 23), (4, 2, 23), (4, 2, 23), (4, 3, 39))

def get_jersey_number(players, player_name):
  for player in players:
    if player[0] == player_name:
      return player[1]

def get_players_scores_in_quarter(game, quarter, jersey_num):
  player_scores = []
  for score in game:
    if score[0] == quarter:
      if score[2] == jersey_num:
        player_scores.append(score[1])
  return player_scores

def get_sum(list):
  sum = 0
  for element in list:
    sum += element
  return sum

def print_player_stat_in_quarter(game, team, quarter, player_name, point):
  scores_in_quarter = get_players_scores_in_quarter(game, quarter, get_jersey_number(team, player_name))
  sum_of_scores = get_sum(scores_in_quarter)
  print(player_name + ' statisztikája a(z) ' + str(quarter) + '. negyedben:')
  if sum_of_scores == 0:
    print('Nem ért el pontot a negyedben')
  else:
    print('Elért pontok: ' + str(sum_of_scores))
    if point in scores_in_quarter:
      print(str(point) + ' pontos dobások száma: ' + str(scores_in_quarter.count(point)))
    else:
      print('Nem volt ' + str(point) + ' pontos dobása')

print_player_stat_in_quarter(lakers_final_game, lakers_players, 2, 'A. Davis', 1)