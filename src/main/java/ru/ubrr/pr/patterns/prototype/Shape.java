package ru.ubrr.pr.patterns.prototype;

import java.util.HashMap;
import java.util.Map;

abstract class Shape implements Cloneable {
    protected String type;

    abstract void draw();

    public String getType() {
        return type;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
