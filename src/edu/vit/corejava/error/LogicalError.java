package edu.vit.corejava.error;

import java.util.Scanner;

/**
 * Java Logical Error Demo
 * Write a Java Program for checking given name has only alphabets and
 * minimum 3 characters
 * 
 * @author Anthoniraj Amalanathan
 * @since 25-Aug-2022
 */

public class LogicalError {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        if (!name.matches("[a-z]+") && name.length() < 3) {
            System.out.println("Invalid Input");
        } else {
            System.out.println(name);
        }
    }
}