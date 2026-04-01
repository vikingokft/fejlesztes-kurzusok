#include <iostream>

int main() {

for (int i = 1; i <= 20; i++) {

if (i == 10) {

std::cout << i << " a legszebb páros szám." << std::endl;

} else if (i % 2 != 0) {

std::cout << i << " egy páratlan szám." << std::endl;

} else {

std::cout << i << " egy páros szám." << std::endl;

}

}

}