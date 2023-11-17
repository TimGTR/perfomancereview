package ru.ubrr.pr.patterns.facade;

class Memory {
    public void load(long position, byte[] data) {
        System.out.println("Memory: Load data to position " + position);
    }
}
