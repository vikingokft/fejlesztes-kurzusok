public class Fruit {

String name;

double amount;

int price;

Fruit(String name, double amount, int price) {

this.name = name;

this.amount = amount;

this.price = price;

}

void printFruit() {

System.out.println(this.name + " " + this.amount + " kg " + this.price + " Ft/kg");

}

}