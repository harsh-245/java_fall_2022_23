package edu.vit.corejava.oop;

class Mobile {
    private double screenSize;

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public double getScreenSize() {
        return screenSize;
    }
}

public class MobileTest {
    public static void main(String[] args) {
        Mobile samsungMobile = new Mobile();
        samsungMobile.setScreenSize(5.7);
        System.out.println(samsungMobile.getScreenSize());

        // new Mobile().setScreenSize(10.5);
    }
}