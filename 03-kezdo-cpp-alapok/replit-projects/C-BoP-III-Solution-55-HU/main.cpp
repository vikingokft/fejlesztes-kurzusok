#include <iostream>

double CalculateCircleCircumference(int radius);

double CalculateCircleArea(int radius);

void PrintCircleData(int radius_from_user);

int main() {

PrintCircleData(4);

}

double CalculateCircleCircumference(int radius) {

return 2 * 3.14 * radius;

}

double CalculateCircleArea(int radius) {

return 3.14 * (radius * radius);

}

void PrintCircleData(int radius_from_user) {

double circumference = CalculateCircleCircumference(radius_from_user);

double area = CalculateCircleArea(radius_from_user);

std::cout << "A kör kerülete " << circumference << "
centiméter." << std::endl;

std::cout << "A kör területe " << area << "
négyzetcentiméter." << std::endl;

}

# Quiz 8. question - Picture

#include <iostream>

std::string UserManual() {

std::cout << "Első utasítás" << std::endl;

return "User Manual";

std::cout << "Második utasítás" << std::endl;

}

# Quiz 9. Question - Picture

#include <iostream>

int main() {

std::cout << "Hello world!" << std::endl;

}

std::string BestCapitals() {

std::string best_european_capitol = "London";

std::string best_asian_capitol = "Singapore";

std::cout << best_european_capitol << std::endl;

std::cout << best_asian_capitol << std::endl;

return "Budapest";

}

# Quiz 10. Question - Picture

#include <iostream>

void SmallDose();

int main() {

int dose = 20;

SmallDose();

std::cout << "Main dose: " << dose << std::endl;

}

void SmallDose() {

int dose = 10;

std::cout << "Small dose: " << dose << std::endl;

}