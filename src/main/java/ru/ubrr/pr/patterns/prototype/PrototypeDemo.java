package ru.ubrr.pr.patterns.prototype;

public class PrototypeDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape1 = ShapeCache.getShape("Circle");
        System.out.println("Shape: " + clonedShape1.getType());

        Shape clonedShape2 = ShapeCache.getShape("Rectangle");
        System.out.println("Shape: " + clonedShape2.getType());
    }
}