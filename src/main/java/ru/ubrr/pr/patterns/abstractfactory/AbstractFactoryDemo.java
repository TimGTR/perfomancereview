package ru.ubrr.pr.patterns.abstractfactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory colorFactory = new ColorFactory();

        Color red = colorFactory.getColor("RED");
        red.fill();

        Color blue = colorFactory.getColor("BLUE");
        blue.fill();
    }
}
