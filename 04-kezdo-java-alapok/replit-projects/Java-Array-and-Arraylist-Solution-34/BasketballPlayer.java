public class BasketballPlayer {

String name;

double height;

int jerseyNumber;

BasketballPlayer(String name, double height, int jerseyNumber) {

this.name = name;

this.height = height;

this.jerseyNumber = jerseyNumber;

}

public void printBasketballPlayer() {

System.out.println("name: " + this.name + ", height in cm: " + this.height + ", number of the jersey: " + this.jerseyNumber);

}

}