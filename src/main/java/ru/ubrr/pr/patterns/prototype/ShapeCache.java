package ru.ubrr.pr.patterns.prototype;

import java.util.HashMap;
import java.util.Map;

class ShapeCache {
    private static Map<String, Shape> shapeMap = new HashMap<>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.draw();
        shapeMap.put(circle.getType(), circle);

        Rectangle rectangle = new Rectangle();
        rectangle.draw();
        shapeMap.put(rectangle.getType(), rectangle);
    }
}

