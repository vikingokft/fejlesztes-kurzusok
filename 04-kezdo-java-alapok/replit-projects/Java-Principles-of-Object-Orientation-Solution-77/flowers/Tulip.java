package flowers;

public class Tulip extends Flower {

    private static final double WATER_ABSORPTION_RATE = 0.5;
    private static final double WATER_NEED = 0.3;
    private static final int PRICE = 699;

    public Tulip(double waterLevel) {
        super(waterLevel);
    }

    @Override
    public void decreaseWaterLevel() {
        this.setWaterLevel(this.getWaterLevel() * WATER_ABSORPTION_RATE);
    }

    public static double getWaterNeed() {
        return WATER_NEED;
    }

    public static int getPrice() {
        return PRICE;
    }

}