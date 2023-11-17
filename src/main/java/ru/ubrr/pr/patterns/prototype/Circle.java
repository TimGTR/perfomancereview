package ru.ubrr.pr.patterns.prototype;

class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    public void draw() {
        System.out.println("Drawing a Circle.");
    }
}
