package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTestSuite {
    @Test
    public void testAddFigure() {
        Shape triangle = new Triangle("triangle", 100);
        ShapeCollector obiekt = new ShapeCollector();
        obiekt.addFigure(triangle);
        Assert.assertEquals(1, obiekt.getFiguresListQuantity());
    }
    @Test
    public void testRemoveFigure() {
        Shape square = new Square("square", 200);
        ShapeCollector obiekt = new ShapeCollector();
        obiekt.addFigure(square);
        obiekt.removeFigure(square);
        Assert.assertEquals(0, obiekt.getFiguresListQuantity());
    }
    @Test
    public void testGetFigure() {
        Shape triangle = new Triangle("triangle", 100);
        Shape square = new Square("square", 200);
        ShapeCollector obiekt = new ShapeCollector();
        obiekt.addFigure(triangle);
        obiekt.addFigure(square);
        Assert.assertEquals(square, obiekt.getFigure(1));
    }
}