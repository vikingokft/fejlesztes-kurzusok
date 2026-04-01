#include <iostream>

void PrintAddition(int number_1, int number_2);

void PrintSubtraction(int number_1, int number_2);

void PrintMultiplication(int number_1, int number_2);

void PrintDivision(int number_1, int number_2);

int AddTwoNumbers(int number_1, int number_2);

int SubtractTwoNumbers(int number_1, int number_2);

int MultiplyTwoNumbers(int number_1, int number_2);

double DivideTwoNumbers(int number_1, int number_2);

int main() {

int number_1 = 10;

int number_2 = 3;

PrintAddition(number_1, number_2);

PrintSubtraction(number_1, number_2);

PrintMultiplication(number_1, number_2);

PrintDivision(number_1, number_2);

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