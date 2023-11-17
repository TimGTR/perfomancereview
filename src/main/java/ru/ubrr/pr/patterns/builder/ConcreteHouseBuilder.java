package ru.ubrr.pr.patterns.builder;

class ConcreteHouseBuilder implements HouseBuilder {
    private House house;

    public ConcreteHouseBuilder() {
        this.house = new House();
    }

    public void buildFoundation() {
        house.setFoundation("Concrete");
    }

    public void buildStructure() {
        house.setStructure("Concrete blocks");
    }

    public void buildRoof() {
        house.setRoof("Concrete roof");
    }

    public void buildInterior() {
        house.setInterior("Concrete interior");
    }

    public House getHouse() {
        return this.house;
    }
}

