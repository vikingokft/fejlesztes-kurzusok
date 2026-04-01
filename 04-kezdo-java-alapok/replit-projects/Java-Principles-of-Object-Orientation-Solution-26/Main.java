public class Main {

    public static void main(String[] args) {
        Vehicle car = new Vehicle(30, 25, 67);
        car.setMaximumSpeed(40);
        System.out.println("maximum speed: " + car.getMaximumSpeed());
        System.out.println("horsepower: " + car.getHorsepower());
        System.out.println("torque: " + car.getTorque());
    }

}