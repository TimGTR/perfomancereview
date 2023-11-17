package ru.ubrr.pr.patterns.command;

class TurnOffCommand implements Command {
    private final Light light;

    public TurnOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOff();
    }
}
