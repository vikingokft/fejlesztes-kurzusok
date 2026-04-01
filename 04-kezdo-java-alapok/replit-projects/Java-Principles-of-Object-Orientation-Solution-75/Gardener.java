import flowers.*;
import java.util.ArrayList;

public class Gardener {

    private ArrayList<Flower> flowers;
    private double waterUsage;

    public Gardener(int numberOfTulips, int numberOfHyacinths) {
        this.flowers = plantFlowers(numberOfTulips, numberOfHyacinths);
        this.waterUsage = 0;
    }

    public ArrayList<Flower> getFlowers() {
        return this.flowers;
    }

    public double getWaterUsage() {
        return this.waterUsage;
    }

    public ArrayList<Flower> plantFlowers(int numberOfTulips, int numberOfHyacinths) {
        ArrayList<Flower> flowerList = new ArrayList<>();
        for (int i = 0; i < numberOfTulips; i++) {
            flowerList.add(new Tulip(0));
        }
        for (int i = 0; i < numberOfHyacinths; i++) {
            flowerList.add(new Hyacinth(0));
        }
        return flowerList;
    }

}