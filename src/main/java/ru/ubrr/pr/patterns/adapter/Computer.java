package ru.ubrr.pr.patterns.adapter;

class Computer implements VGA {
    public void connectVGA() {
        System.out.println("VGA connected");
    }
}
