package ru.ubrr.pr.patterns.chain;

class ConsoleLogger extends Logger {
    public ConsoleLogger(int level) {
        this.level = level;
    }

    protected void write(String message) {
        System.out.println("Console Logger: " + message);
    }
    protected int getLogLevel() {
        return Logger.INFO;
    }
}
