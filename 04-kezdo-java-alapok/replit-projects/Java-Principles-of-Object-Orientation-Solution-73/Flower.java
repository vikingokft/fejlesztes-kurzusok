public abstract class Flower {

    private double waterLevel;

    public Flower(double waterLevel) {
        this.waterLevel = waterLevel;
    }

    public double getWaterLevel() {
        return this.waterLevel;
    }

    public void setWaterLevel(double waterLevel) {
        this.waterLevel = waterLevel;
    }

    public abstract void decreaseWaterLevel();

    public void printFlower() {
        System.out.println("[WaterLevel: " + this.waterLevel + "]");
    }

}