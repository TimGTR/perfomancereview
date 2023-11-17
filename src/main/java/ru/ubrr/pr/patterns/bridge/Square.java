package ru.ubrr.pr.patterns.bridge;

class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    public void draw() {
        System.out.print("Drawing square: ");
        color.applyColor();
    }
}
