package edu.vit.corejava.basics;

/*
 * Demo Program for while loop
 * Problem: Write a Program to print the Even Numbers 
 *          between 1 and 100
 * @author Anthoniraj Amalanathan
 * @since 01-Aug-2022
 */

public class WhileLoopDemo {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i = i + 1;
        }
    }
}
