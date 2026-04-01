public class Main {

    public static void main(String[] args) {
        RaceCar ferrari = new RaceCar(360, 1000, 16000, new Driver("Schumacher", 52), "Ferrari");
        RaceCar honda = new RaceCar(350, 950, 15500, new Driver("Verstappen", 27), "Red Bull");
        Garage smallGarage = new Garage("P. Sherman, 42, Wallaby Way, Sydney", 1);

        smallGarage.addVehicle(ferrari);
        smallGarage.addVehicle(honda);
        smallGarage.printGarage();
    }

}