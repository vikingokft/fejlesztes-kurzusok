#include <iostream>

void PrintAddition(int number_1, int number_2);

void PrintSubtraction(int number_1, int number_2);

void PrintMultiplication(int number_1, int number_2);

void PrintDivision(int number_1, int number_2);

int AddTwoNumbers(int number_1, int number_2);

int SubtractTwoNumbers(int number_1, int number_2);

int MultiplyTwoNumbers(int number_1, int number_2);

double DivideTwoNumbers(int number_1, int number_2);

void ListOperations();

void CalculateResult(char option, int number_1, int number_2);

int main() {

// 1) Egy változó deklarálása a kilépésnél megadott „x" karakter
mentéséhez.

char option;

// 2) A ciklus indítása.

do {

ListOperations();

// 3) Karakter bekérése a felhasználótól.

std::cin >> option;

// 4) Az „x" karakter ellenőrzése.

if (option == 'x') {

// 5) Üzenet a felhasználónak a program leállításáról.

std::cout << "Viszlát!" << std::endl;

} else if (option != 'a' && option != 'b' && option != 'c' &&
option != 'd') {

std::cerr << "Rossz karaktert adtál meg, ezért a program leáll."
<< std::endl;

return 1;

}

// 6) A már kész számológép futtatása.

int number_1;

int number_2;

std::cout << "Add meg az első számot: ";

std::cin >> number_1;

std::cout << "Add meg a második számot: ";

std::cin >> number_2;

CalculateResult(option, number_1, number_2);

// 7) Az „x" karakter ellenőrzése a kontrolláló feltételben.

} while (option != 'x');

}

// összeadás kinyomtatása

void PrintAddition(int number_1, int number_2) {

std::cout << number_1 << " + " << number_2 << " = " <<
AddTwoNumbers(number_1, number_2) << std::endl;

}

// kivonás kinyomtatása

void PrintSubtraction(int number_1, int number_2) {

std::cout << number_1 << " - " << number_2 << " = " <<
SubtractTwoNumbers(number_1, number_2) << std::endl;

}

// szorzás kinyomtatása

void PrintMultiplication(int number_1, int number_2) {

std::cout << number_1 << " * " << number_2 << " = " <<
MultiplyTwoNumbers(number_1, number_2) << std::endl;

}

// osztás kinyomtatása

void PrintDivision(int number_1, int number_2) {

std::cout << number_1 << " / " << number_2 << " = " <<
DivideTwoNumbers(number_1, number_2) << std::endl;

}

// összeadás

int AddTwoNumbers(int number_1, int number_2) {

return number_1 + number_2;

}

// kivonás

int SubtractTwoNumbers(int number_1, int number_2) {

return number_1 - number_2;

}

// szorzás

int MultiplyTwoNumbers(int number_1, int number_2) {

return number_1 * number_2;

}

// osztás

double DivideTwoNumbers(int number_1, int number_2) {

return number_1 / (double) number_2;

}

// használható utasítások kinyomtatása

void ListOperations() {

std::cout << "Választható műveletek:" << std::endl;

std::cout << "\\t a) - Összeadás" << std::endl;

std::cout << "\\t b) - Kivonás" << std::endl;

std::cout << "\\t c) - Szorzás" << std::endl;

std::cout << "\\t d) - Osztás" << std::endl;

std::cout << "\\t x) - Kilépés" << std::endl;

std::cout << "Művelet kiválasztásához üsd be a megfelelő betűt! ";

}

// a számítások

void CalculateResult(char option, int number_1, int number_2) {

if (option == 'a') {

PrintAddition(number_1, number_2);

} else if (option == 'b') {

PrintSubtraction(number_1, number_2);

} else if (option == 'c') {

PrintMultiplication(number_1, number_2);

} else if (option == 'd') {

PrintDivision(number_1, number_2);

}

}