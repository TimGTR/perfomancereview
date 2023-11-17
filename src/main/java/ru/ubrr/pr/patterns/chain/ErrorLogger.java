package ru.ubrr.pr.patterns.chain;

class ErrorLogger extends Logger {
    public ErrorLogger(int level) {
        this.level = level;
    }

    protected void write(String message) {
        System.out.println("Error Logger: " + message);
    }

    protected int getLogLevel() {
        return Logger.ERROR;
    }
}

