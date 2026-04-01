#include <iostream>

void CalculateRectangleArea(int width, int height);

int main() {

CalculateRectangleArea(2, 5);

}

void CalculateRectangleArea(int width, int height) {

int area = width * height;

std::cout << "A négyszög területe " << area << "
négyzetméter." << std::endl;

}