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

int main() {

int number_1 = 10;

int number_2 = 3;

// 1) Egy változó deklarálása a felhasználó által kiválasztott
művelettípus lementéséhez.

char option;

// 2) Műveletek kilistázása a konzolra.

ListOperations();

// 3) A művelet típusának bekérése a felhasználótól.

std::cin >> option;

// 4) Helytelen bemenet esetén a program kiléptetése.

if (option != 'a' && option != 'b' && option != 'c' && option !=
'd') {

// 5) Üzenet a felhasználónak a program hibájáról.

std::cerr << "Rossz karaktert adtál meg, ezért a program leáll."
<< std::endl;

// 6) Program kiléptetése hiba esetén.

return 1;

}

// 7) A két szám bekérése a felhasználótól.

// 8) A felhasználó által kiválasztott művelet végrehajtása az
alábbiakból.

/*

a) Összeadás

b) Kivonás

c) Szorzás

d) Osztás

*/

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

// 1) Az első sorban a következő üzenet jelenjen meg a konzolon:
`Választható műveletek:`.

std::cout << "Választható műveletek:" << std::endl;

// 2) Nyomtasd ki az elérhető műveletek listáját a konzolra.

std::cout << "\\t a) Összeadás" << std::endl;

std::cout << "\\t b) Kivonás" << std::endl;

std::cout << "\\t c) Szorzás" << std::endl;

std::cout << "\\t d) Osztás" << std::endl;

// 3) Utolsó sorban pedig a következőt nyomtasd ki a konzolra: `Művelet
kiválasztásához üsd be a megfelelő betűt!`

std::cout << "Művelet kiválasztásához üsd be a megfelelő betűt! ";

}