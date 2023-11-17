package ru.ubrr.pr.patterns.facade;

class HardDrive {
    public byte[] read(long lba, int size) {
        System.out.println("HardDrive: Read " + size + " bytes from " + lba);
        return new byte[size];
    }
}
