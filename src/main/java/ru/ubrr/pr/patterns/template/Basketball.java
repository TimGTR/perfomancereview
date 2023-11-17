package ru.ubrr.pr.patterns.template;

class Basketball extends Game {
    void initialize() {
        System.out.println("Basketball Game Initialized! Start playing.");
    }

    void startPlay() {
        System.out.println("Basketball Game Started. Enjoy the game!");
    }

    void endPlay() {
        System.out.println("Basketball Game Finished!");
    }
}
