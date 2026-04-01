public class RaceCar extends Vehicle {

    private Driver driver;
    private String sponsor;

    public RaceCar(int maximumSpeed, int horsepower, int torque, Driver driver, String sponsor) {
        super(maximumSpeed, horsepower, torque);
        this.driver = driver;
        this.sponsor = sponsor;
    }

    public Driver getDriver() {
        return this.driver;
    }

    public String getSponsor() {
        return this.sponsor;
    }

    public void printRaceCar() {
        System.out.println("Formula 1 car details");
        System.out.println("sponsor: " + this.sponsor);
        System.out.println("maximum speed: " + this.getMaximumSpeed());
        System.out.println("horsepower: " + this.getHorsepower());
        System.out.println("torque: " + this.getTorque());
        System.out.println("Driver's name: " + this.driver.getName() + ", age: " + this.driver.getAge());
    }

    @Override
    public void startEngine() {
        System.out.println("Starting racecar...");
    }

}