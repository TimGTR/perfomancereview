package ru.ubrr.pr.patterns.adapter;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        VGA computer = new Computer();
        HDMI adapter = new VGAAdapter(computer);
        adapter.connectHDMI();
    }
}
