#include <iostream>

int main() {

int all_turbines = 25;

int turbine_counter = 0;

int turbine_power = 0;

int sum_power = 0;

for (int i = 0; i < all_turbines; i++) {

if (i < 10) {

turbine_counter++;

turbine_power = 2000;

sum_power += turbine_power;

std::cout << "A(z) " << turbine_counter << ". számú szélturbina
teljes fordulaton működik, " << turbine_power << " MWh-t termelve.
A farmon termelt összenergia jelenleg " << sum_power << " MWh."
<< std::endl;

} else if (i < 20) {

turbine_counter++;

turbine_power = 1000;

sum_power += turbine_power;

std::cout << "A(z) " << turbine_counter << ". számú szélturbina
fél fordulaton működik, " << turbine_power << " MWh-t termelve. A
farmon termelt összenergia jelenleg " << sum_power << " MWh."
<< std::endl;

} else if (i < 25) {

turbine_counter++;

turbine_power = 0;

sum_power += turbine_power;

std::cout << "A(z) " << turbine_counter << ". számú szélturbina
nem működik, " << turbine_power << " MWh-t termelve. A farmon
termelt összenergia jelenleg " << sum_power << " MWh." <<
std::endl;

} else {

std::cout << "Valami váratlan történt." << std::endl;

}

}

}

# Quiz 3. question - Picture

if (number % 5 == 0) {

std::cout << "Prímszám vagyok" << std::endl;

} else {

std::cout << "Nem vagzok prímszám" << std::endl;

}

# Quiz 9. question - Picture

int gas_amount = 30;

for(int i = 0; i > 50; i++) {

if (gas_amount > 10) {

gas_amount--;

} else {

std::cout << "Alacsony üzemanyagszint!" << std::endl;

}

}