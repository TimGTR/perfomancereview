package ru.ubrr.pr.patterns.chain;

class FileLogger extends Logger {
    public FileLogger(int level) {
        this.level = level;
    }
    protected void write(String message) {
        System.out.println("File Logger: " + message);
    }
    protected int getLogLevel() {
        return Logger.DEBUG;
    }
}
