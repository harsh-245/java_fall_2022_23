package edu.vit.corejava.oop;

public class RectangleTest {
    public static void main(String[] args) {
        // Rectangle rect = new Rectangle();
        // System.out.println(rect.findArea());

        // Rectangle rectN = new Rectangle(10, 30);
        // System.out.println(rectN.findArea());

        // Mobile miMobile = new Mobile();
        // miMobile.setScreen(6.5);
        // System.out.println(miMobile.getScreen());

        // miMobile.setScreen(5.5);

        Rectangle rectOne = new Rectangle();
        rectOne.setLength(45.6);
        rectOne.setWidth(56.3);
        System.out.println(rectOne.findArea());

        rectOne.setLength(34.7);
        rectOne.setWidth(16.5);
        System.out.println(rectOne.findArea());
    }
}
