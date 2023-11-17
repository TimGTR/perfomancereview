package ru.ubrr.pr.patterns.bridge;

class RedColor implements Color {
    public void applyColor() {
        System.out.println("Applying red color");
    }
}