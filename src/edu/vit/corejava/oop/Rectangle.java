package edu.vit.corejava.oop;

/*
 * The Demo program for class rectangle
 * @author Anthoniraj Amalanathan
 * @since 08-08-2022
 */

public class Rectangle {
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle() {
        length = 10.5;
        width = 20.4;
    }

    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    double findArea() {
        return length * width;
    }

}
