package ru.ubrr.pr.patterns.facade;

class CPU {
    public void freeze() {
        System.out.println("CPU: Freeze");
    }

    public void jump(long position) {
        System.out.println("CPU: Jump to position " + position);
    }

    public void execute() {
        System.out.println("CPU: Execute");
    }
}
