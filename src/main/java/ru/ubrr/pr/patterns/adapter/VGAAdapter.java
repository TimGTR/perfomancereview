package ru.ubrr.pr.patterns.adapter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class VGAAdapter implements HDMI {
    private final VGA vga;
    public void connectHDMI() {
        vga.connectVGA();
        System.out.println("VGA to HDMI adapter connected");
    }
}
