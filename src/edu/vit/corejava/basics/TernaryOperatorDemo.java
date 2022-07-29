package edu.vit.corejava.basics;

import java.util.Scanner;

public class TernaryOperatorDemo {
    private static long fact(int n) {
        return (n == 0 || n == 1) ? 1 : n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt(); // For getting Integer input
        System.out.println(TernaryOperatorDemo.fact(10));
    }
}
