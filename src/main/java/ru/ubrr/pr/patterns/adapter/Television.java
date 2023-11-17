package ru.ubrr.pr.patterns.adapter;

class Television implements HDMI {
    public void connectHDMI() {
        System.out.println("HDMI connected");
    }
}
