package ru.ubrr.pr.patterns.command;

class TurnOnCommand implements Command {
    private final Light light;

    public TurnOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOn();
    }
}