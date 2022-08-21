package edu.vit.corejava.oop;

class RectBasic {
    private double length;
    private double width;

    public RectBasic() { // Default Constructor
        length = 10.5;
        width = 20.5;
    }

    public RectBasic(double l, double w) { // Parameterized Cons
        length = l;
        width = w;
    }

    double findArea() {
        return length * width;
    }
}

public class RectDemo {
    public static void main(String[] args) {
        RectBasic rb = new RectBasic(); // Heap Memory
        System.out.println(rb.findArea());

        RectBasic rb2 = new RectBasic(10.7, 34.6);
        System.out.println(rb2.findArea());

        RectBasic rb3 = new RectBasic(20.7, 37.6);
        System.out.println(rb3.findArea());
    }
}
