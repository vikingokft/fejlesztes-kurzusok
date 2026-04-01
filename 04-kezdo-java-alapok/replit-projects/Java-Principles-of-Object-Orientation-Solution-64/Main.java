public class Main {

    public static void main(String[] args) {
        RaceCar ferrari = new RaceCar(360, 1000, 16000, new Driver("Schumacher", 52), "Ferrari");
        RaceCar honda = new RaceCar(350, 300, 300, new Driver("Verstappen", 27), "Red Bull");
        Motorbike kawasaki = new Motorbike(200, 180, 100, "cross");
        Garage garage = new Garage("Budapest", 3);

        garage.addVehicle(ferrari);
        garage.addVehicle(honda);
        garage.addVehicle(kawasaki);
        garage.startVehicles();
    }

}