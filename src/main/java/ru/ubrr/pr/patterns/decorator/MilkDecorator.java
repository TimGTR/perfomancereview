package ru.ubrr.pr.patterns.decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class MilkDecorator implements Beverage {
    private final Beverage beverage;
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
    public double getCost() {
        return beverage.getCost() + 0.5;
    }
}
