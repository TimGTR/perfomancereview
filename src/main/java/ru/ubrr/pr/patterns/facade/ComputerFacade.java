package ru.ubrr.pr.patterns.facade;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class ComputerFacade {
    private final CPU cpu;
    private final Memory memory;
    private final HardDrive hardDrive;

    public void start() {
        cpu.freeze();
        memory.load(0, hardDrive.read(0, 1024));
        cpu.jump(0);
        cpu.execute();
    }
}
