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

}