package ru.ubrr.pr.patterns.interpreter;

class TerminalExpression implements Expression {
    private final String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    public boolean interpret(String context) {
        return context.contains(data);
    }
}
