package ru.ubrr.pr.patterns.bridge;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redSquare = new Square(new RedColor());
        redSquare.draw();

        Shape blueSquare = new Square(new BlueColor());
        blueSquare.draw();
    }
}
