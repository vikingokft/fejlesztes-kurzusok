#include <iostream>

void AddTwoNumbers(int number_1, int number_2);

void SubtractTwoNumbers(int number_1, int number_2);

void MultiplyTwoNumbers(int number_1, int number_2);

void DivideTwoNumbers(int number_1, int number_2);

int main() {

int number_1 = 10;

int number_2 = 3;

AddTwoNumbers(number_1, number_2);

SubtractTwoNumbers(number_1, number_2);

MultiplyTwoNumbers(number_1, number_2);

DivideTwoNumbers(number_1, number_2);

}

// összeadás

void AddTwoNumbers(int number_1, int number_2) {

std::cout << number_1 << " + " << number_2 << " = " <<
number_1 + number_2 << std::endl;

}

// kivonás

void SubtractTwoNumbers(int number_1, int number_2) {

std::cout << number_1 << " - " << number_2 << " = " <<
number_1 - number_2 << std::endl;

}

// szorzás

void MultiplyTwoNumbers(int number_1, int number_2) {

std::cout << number_1 << " * " << number_2 << " = " <<
number_1 * number_2 << std::endl;

}

// osztás

void DivideTwoNumbers(int number_1, int number_2) {

std::cout << number_1 << " / " << number_2 << " = " <<
number_1 / (double) number_2 << std::endl;

}