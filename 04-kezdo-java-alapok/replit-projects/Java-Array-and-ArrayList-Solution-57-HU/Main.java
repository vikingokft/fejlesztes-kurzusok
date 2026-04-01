import java.util.ArrayList;

public class Main {

public static void main(String[] args) {

ArrayList<Fruit> fruits = new ArrayList<>();

Market market = new Market(fruits);

market.addFruit("gránátalma", 12.5, 800);

market.addFruit("kivi", 20.3, 600);

System.out.println();

//market.printWare();

//market.modifyAmount(0, 3);

//market.removeFruit(1);

System.out.println(market.searchFruit("gránátalma"));

System.out.println(market.searchFruit("barack"));

}

}