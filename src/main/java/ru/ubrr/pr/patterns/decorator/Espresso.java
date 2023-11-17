package ru.ubrr.pr.patterns.decorator;

class Espresso implements Beverage {
    public String getDescription() {
        return "Espresso";
    }

    public double getCost() {
        return 1.99;
    }
}
