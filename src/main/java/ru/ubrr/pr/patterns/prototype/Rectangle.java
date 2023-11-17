package ru.ubrr.pr.patterns.prototype;

class Rectangle extends Shape {
    public Rectangle() {
        type = "Rectangle";
    }

    public void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}
