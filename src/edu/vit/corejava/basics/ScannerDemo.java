package edu.vit.corejava.basics;

import java.util.Scanner;

/*
 * Scanner Input Demo
 * @author Anthoniraj Amalanathan
 * @since 28-Jul-2022
 */

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number-1: ");
        int numberOne = sc.nextInt();
        /*
         * This is required if you are using more than one method from scanner
         * class continuously except nextLine()
         */
        sc.nextLine();
        System.out.print("Enter Number-2: ");
        int numberTwo = sc.nextInt();

        System.out.println("The Addition is " + (numberOne + numberTwo));
    }
}