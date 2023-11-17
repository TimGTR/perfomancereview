package ru.ubrr.pr.patterns.command;

public class CommandPatternDemo {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        Light light = new Light();

        Command turnOn = new TurnOnCommand(light);
        Command turnOff = new TurnOffCommand(light);

        remote.setCommand(turnOn);
        remote.pressButton();

        remote.setCommand(turnOff);
        remote.pressButton();
    }
}
