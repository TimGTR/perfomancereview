package ru.ubrr.pr.patterns.strategy;

class OperationAdd implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}
