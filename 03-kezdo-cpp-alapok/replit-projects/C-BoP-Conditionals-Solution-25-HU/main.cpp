#include <iostream>

int main() {

int age;

std::cout << "Hány éves vagy? ";

std::cin >> age;

if (age == 18) {

std::cout << "Pont 18? Gratulálunk, üdv a felnőttek között! Jó
szórakozást a cikkhez!" << std::endl;

} else if (age < 18) {

std::cout << "Sajnáljuk, de ez a cikk csak 18 éven felüliek számára
érhető el." << std::endl;

} else {

std::cout << "Köszönjük! Elolvashatod ezt a cikket." << std::endl;

}

}