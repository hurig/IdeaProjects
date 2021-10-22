package FactoryMethod;

public class VehicleFactory {

    public static Vehicle getVehicle(){
        return new Motorcycle("Kawasaki", "Apagy");
    }
}
