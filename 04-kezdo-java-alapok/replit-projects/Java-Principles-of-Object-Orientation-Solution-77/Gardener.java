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

    public double waterEveryFlower() {
        double totalWater = 0;
        for (int i = 0; i < this.flowers.size(); i++) {
            Flower flower = this.flowers.get(i);
            double waterAmount;
            if (flower instanceof Tulip) {
                waterAmount = Tulip.getWaterNeed();
            } else {
                waterAmount = Hyacinth.getWaterNeed();
            }
            totalWater += waterAmount;
            flower.setWaterLevel(waterAmount);
        }
        return totalWater;
    }

    public void absorbWater() {
        for (int i = 0; i < this.flowers.size(); i++) {
            this.flowers.get(i).decreaseWaterLevel();
        }
    }

    public void workAWeek() {
        for (int day = 0; day < 6; day++) {
            double waterUsedToday = waterEveryFlower();
            this.waterUsage += waterUsedToday;
            absorbWater();
        }
    }

    public int sellFlowers() {
        int income = 0;
        for (int i = 0; i < this.flowers.size(); i++) {
            Flower flower = this.flowers.get(i);
            if (flower instanceof Tulip) {
                income += Tulip.getPrice();
            } else {
                income += Hyacinth.getPrice();
            }
        }
        this.flowers.clear();
        return income;
    }

}