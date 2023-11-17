package ru.ubrr.pr.patterns.template;

abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }
}
