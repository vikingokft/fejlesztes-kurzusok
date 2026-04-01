public class Motorbike extends Vehicle {

    private String type;

    public Motorbike(int maximumSpeed, int horsepower, int torque, String type) {
        super(maximumSpeed, horsepower, torque);
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting motorbike...");
    }

}