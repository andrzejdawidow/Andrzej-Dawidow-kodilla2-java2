package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> listOfFigures = new ArrayList<>();

    public void addFigure(Shape shape) {
        listOfFigures.add(shape);
    }

    public void removeFigure(Shape shape) {
        listOfFigures.remove(shape);
    }

    public Shape getFigure(int n) {
        return listOfFigures.get(n);
    }

    public int getFiguresListQuantity() { return listOfFigures.size();
    }

    public void showFigures() {
    }
}
