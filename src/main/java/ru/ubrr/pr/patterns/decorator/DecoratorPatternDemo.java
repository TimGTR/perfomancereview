package ru.ubrr.pr.patterns.decorator;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        // Заказ Espresso с добавлением молока
        Beverage espresso = new Espresso();
        Beverage milkEspresso = new MilkDecorator(espresso);

        System.out.println("Drink: " + milkEspresso.getDescription());
        System.out.println("Cost: $" + milkEspresso.getCost());
    }
}
