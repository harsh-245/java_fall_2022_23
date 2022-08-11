package edu.vit.corejava.oop;

public class HeapStack {
    private static final double PI = 3.1415;
    private double radius;

    public HeapStack() {
        radius = 10.5;
    }

    public double findAreaOfCircle() {
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        HeapStack hs = new HeapStack();
        System.out.println(hs.findAreaOfCircle());
    }

}
