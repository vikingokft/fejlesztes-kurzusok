#include <iostream>

void PrintSandwichRecipe(std::string condiment, std::string meat,
std::string cheese, std::string vegetable);

int main() {

PrintSandwichRecipe("majonéz", "sonka", "cheddar",
"paradicsom");

}

void PrintSandwichRecipe(std::string condiment, std::string meat,
std::string cheese, std::string vegetable) {

std::cout << "1. Fogj két szelet kenyeret." << std::endl;

std::cout << "2. Az egyik szeletre nyomj " + condiment + "-t."
<< std::endl;

std::cout << "3. Helyezz a kenyérre két szelet " + meat + "-t."
<< std::endl;

std::cout << "4. Rakj rá egy szelet " + cheese + "-t." <<
std::endl;

std::cout << "5. Koronázd meg pár szelet/karika/csipet ilyen
zöldséggel: " + vegetable + "." << std::endl;

std::cout << "6. Borítsd be a szendvicset a másik szelet kenyérrel."
<< std::endl;

std::cout << "7. Jó étvágyat!" << std::endl;

}