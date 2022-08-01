package edu.vit.corejva.basics;

import java.util.Scanner;

/*
 * Conditional Statements in Java
 * Problem: Write a Java Program to find whether given number is even or odd. 
 *          Print an appropriate message to user in console.
 * @author Anthoniraj Amalanathan
 * @since 01-Aug-2022
 */

public class ConditionalDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("The number is even!");
        } else {
            System.out.println("The Number is odd!");
        }
    }
}