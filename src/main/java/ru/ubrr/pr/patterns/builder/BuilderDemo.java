package ru.ubrr.pr.patterns.builder;

public class BuilderDemo {
    public static void main(String[] args) {
        HouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();
        HouseDirector houseDirector = new HouseDirector(concreteHouseBuilder);

        House house = houseDirector.constructHouse();

        System.out.println("Foundation: " + house.getFoundation());
        System.out.println("Structure: " + house.getStructure());
        System.out.println("Roof: " + house.getRoof());
        System.out.println("Interior: " + house.getInterior());
    }
}