#include <iostream>

int CalculateAge(int currentYear, int yearOfBirth);

int main() {

std::cout << CalculateAge(2020, 1991) << std::endl;

}

int CalculateAge(int currentYear, int yearOfBirth) {

int age = currentYear - yearOfBirth;

return age;

}