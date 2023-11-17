package ru.ubrr.pr.patterns.factorymethod;

class CarFactory extends VehicleFactory {
    public Vehicle createVehicle() {
        return new Car();
    }
}
