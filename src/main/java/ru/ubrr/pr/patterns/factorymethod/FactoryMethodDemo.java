package ru.ubrr.pr.patterns.factorymethod;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        car.manufacture();

        VehicleFactory bikeFactory = new BikeFactory();
        Vehicle bike = bikeFactory.createVehicle();
        bike.manufacture();
    }
}
