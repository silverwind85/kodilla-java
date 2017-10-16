package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapes.add(shape);

    }

    public int getFigureQuantity() {
        return shapes.size();

    }

    public Shape getFigure(int n) {
        Shape shape = null;
        if (n >= 0 && n < shapes.size()) {
            shape = shapes.get(n);
        }
        return shape;
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapes.contains(shape)) {
            shapes.remove(shape);
            result = true;
        }
        return result;
    }


    public String showFigures() {
        StringBuilder s = new StringBuilder();
        for (Shape shape : shapes
                ) {
            s.append(shape.toString());
        }
        return s.toString();
    }
}
