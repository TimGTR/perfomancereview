package ru.ubrr.pr.patterns.interpreter;

interface Expression {
    boolean interpret(String context);
}
