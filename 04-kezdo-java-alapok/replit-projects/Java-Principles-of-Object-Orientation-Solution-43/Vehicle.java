public class Vehicle {

    private int maximumSpeed;
    private int horsepower;
    private int torque;

    public Vehicle(int maximumSpeed, int horsepower, int torque) {
        this.maximumSpeed = maximumSpeed;
        this.horsepower = horsepower;
        this.torque = torque;
    }

    public int getMaximumSpeed() {
        return this.maximumSpeed;
    }

    public void setMaximumSpeed(int maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public int getHorsepower() {
        return this.horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getTorque() {
        return this.torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public void printVehicle() {
        System.out.println("maximum speed: " + this.maximumSpeed);
        System.out.println("horsepower: " + this.horsepower);
        System.out.println("torque: " + this.torque);
    }

}