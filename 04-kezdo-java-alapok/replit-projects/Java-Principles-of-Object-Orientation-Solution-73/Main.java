import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Flower> flowers = new ArrayList<>();
        flowers.add(new Tulip(0.4));
        flowers.add(new Hyacinth(0.3));
        flowers.add(new Tulip(0.4));

        for (int i = 0; i < flowers.size(); i++) {
            flowers.get(i).decreaseWaterLevel();
            flowers.get(i).printFlower();
        }
    }

}