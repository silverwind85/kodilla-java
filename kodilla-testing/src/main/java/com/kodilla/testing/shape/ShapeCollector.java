package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapes.add(shape);

    }

    public int getFigureQuantity() {
        return shapes.size();

    }

    public Shape getFigure(int n) {
        if (n < 0 || n > shapes.size()) {
            return null;
        }
        return shapes.get(n);
    }

    public boolean removeFigure(Shape shape) {
        return shapes.remove(shape);
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
