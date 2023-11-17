package ru.ubrr.pr.patterns.factorymethod;

class BikeFactory extends VehicleFactory {
    public Vehicle createVehicle() {
        return new Bike();
    }
}
