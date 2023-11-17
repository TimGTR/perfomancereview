package ru.ubrr.pr.patterns.strategy;

class OperationSubtract implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}
