import java.util.ArrayList;

public class Garage {

    private String address;
    private int capacity;
    private ArrayList<Vehicle> vehicles;

    public Garage(String address, int capacity) {
        this.address = address;
        this.capacity = capacity;
        this.vehicles = new ArrayList<>();
    }

    public String getAddress() {
        return this.address;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public ArrayList<Vehicle> getVehicles() {
        return this.vehicles;
    }

    public void addVehicle(Vehicle vehicle) {
        if (this.vehicles.size() < this.capacity) {
            this.vehicles.add(vehicle);
        } else {
            System.out.println("The garage is full!");
        }
    }

    public void startVehicles() {
        for (int i = 0; i < this.vehicles.size(); i++) {
            this.vehicles.get(i).startEngine();
        }
    }

    public void printGarage() {
        System.out.println("The garage is located at " + this.address + ". It has " + this.capacity + " space(s) and currently has " + this.vehicles.size() + " vehicle(s) in it.");
    }

}