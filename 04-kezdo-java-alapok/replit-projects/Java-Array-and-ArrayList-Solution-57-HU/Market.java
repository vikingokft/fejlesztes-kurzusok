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

void modifyAmount(int fruitIndex, double amount) {

Fruit fruit = fruits.get(fruitIndex);

double newAmount = fruit.amount + amount;

fruit.amount = newAmount;

fruits.set(fruitIndex, fruit);

System.out.println(amount + " kg-mal nőtt a " + fruit.name + " mennyisége az árukészletben.");

}

void removeFruit(int fruitIndex) {

Fruit fruit = fruits.remove(fruitIndex);

waste.add(fruit);

System.out.println(fruit.amount + " kg " + fruit.name + " került kidobásra.");

}

String searchFruit(String fruitName) {

ArrayList<String> fruitNames = new ArrayList<>();

for (int i = 0; i < fruits.size(); i++) {

fruitNames.add(fruits.get(i).name);

}

if(fruitNames.contains(fruitName)) {

return "A keresett gyümölcs megtalálható a készletben.";

} else {

return "A keresett gyümölcs nincs készeleten.";

}

}

}