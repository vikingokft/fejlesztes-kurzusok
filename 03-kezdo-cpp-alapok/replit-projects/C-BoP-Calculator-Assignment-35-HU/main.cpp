#include <iostream>

bool CheckLogin(std::string user_name, std::string password);

int main() {

if (CheckLogin("James Bond", "Moneypenny")) {

std::cout << "Isten hozta Mr. Bond!" << std::endl;

} else {

std::cout << "Próbálja újra, Mr. Bond" << std::endl;

}

}

bool CheckLogin(std::string user_name, std::string password) {

if (/*ide írd a kódod*/) {

return true;

} else {

return false;

}

}