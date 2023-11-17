package ru.ubrr.pr.patterns.chain;

public class
ChainOfResponsibilityPatternDemo {
    public static void main(String[] args) {
        Logger errorLogger = new ErrorLogger(Logger.ERROR);
        Logger fileLogger = new FileLogger(Logger.DEBUG);
        Logger consoleLogger = new ConsoleLogger(Logger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        errorLogger.logMessage(Logger.INFO, "This is an info message");
        errorLogger.logMessage(Logger.DEBUG, "This is a debug message");
        errorLogger.logMessage(Logger.ERROR, "This is an error message");
    }
}
