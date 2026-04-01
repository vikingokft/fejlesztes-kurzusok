import java.util.ArrayList;

public class Market {

ArrayList<Fruit> fruits;

Market(ArrayList<Fruit> fruits) {

this.fruits = fruits;

}

void addFruit(String name, double amount, int price) {

Fruit newFruit = new Fruit(name, amount, price);

fruits.add(newFruit);

System.out.println(amount + " kg " + name + " hozzáadva az árukészlethez");

}

void printWare() {

System.out.println("\nÁrukészlet:");

for (int i = 0; i < fruits.size(); i++) {

System.out.print("\t");

fruits.get(i).printFruit();

}

}

}