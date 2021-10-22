package FactoryMethod;

public class Person {

    private String name;
    private String position;
    private Vehicle vehicle;

    public Person(String name, String position) {
        this.name = name;
        this.position = position;
        this.vehicle = VehicleFactory.getVehicle();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void driveTo(String position) {
        vehicle.takeAway(position);
        this.position = position;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
