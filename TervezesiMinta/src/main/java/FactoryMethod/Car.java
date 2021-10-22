package FactoryMethod;

public class Car implements Vehicle{
    private String brand;
    private String position;

    public Car(String brand, String position) {
        this.brand = brand;
        this.position = position;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public void takeAway(String position) {
        this.position = position;
    }
}
