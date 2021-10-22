package FactoryMethod;

public class Motorcycle implements Vehicle{

    private String brand;
    private String position;

    public Motorcycle(String brand, String position) {
        this.brand = brand;
        this.position = position;
    }
    @Override
    public void takeAway(String destination) {
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

    public void setPosition(String position) {
        this.position = position;
    }
}
