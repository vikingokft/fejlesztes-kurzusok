all_turbines = 25
turbine_counter = 0
turbine_power = 0
sum_power = 0
counter = 0

while counter < all_turbines:
  if counter < 10:
    turbine_counter += 1
    turbine_power = 2000
    sum_power += turbine_power
    print('A(z) ' + str(turbine_counter) + '. számú szélturbina teljes fordulaton működik, ' + str(turbine_power) + ' MWh-t termelve. A farmon termelt összenergia jelenleg ' + str(sum_power) + ' MWh.')
  elif counter < 20:
    turbine_counter += 1
    turbine_power = 1000
    sum_power += turbine_power
    print('A(z) ' + str(turbine_counter) + '. számú szélturbina fél fordulaton működik, ' + str(turbine_power) + ' MWh-t termelve. A farmon termelt összenergia jelenleg ' + str(sum_power) + ' MWh.')
  elif counter < 25:
    turbine_counter += 1
    turbine_power = 0
    sum_power += turbine_power
    print('A(z) ' + str(turbine_counter) + '. számú szélturbina nem működik, ' + str(turbine_power) + ' MWh-t termelve. A farmon termelt összenergia jelenleg ' + str(sum_power) + ' MWh.')
  else:
    print('Valami váratlan történt.')
  counter += 1