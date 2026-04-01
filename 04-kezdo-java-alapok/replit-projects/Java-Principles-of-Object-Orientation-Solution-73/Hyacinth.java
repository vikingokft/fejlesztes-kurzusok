public class Hyacinth extends Flower {

    private static final double WATER_ABSORPTION_RATE = 0.333;
    private static final int PRICE = 999;

    public Hyacinth(double waterLevel) {
        super(waterLevel);
    }

    @Override
    public void decreaseWaterLevel() {
        this.setWaterLevel(this.getWaterLevel() * WATER_ABSORPTION_RATE);
    }

    public static int getPrice() {
        return PRICE;
    }

}