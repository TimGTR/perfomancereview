package ru.ubrr.pr.patterns.bridge;

import lombok.AllArgsConstructor;

@AllArgsConstructor
abstract class Shape {
    protected Color color;
    abstract void draw();
}
