package edu.vit.corejava.basics;

/*
 * Demo Program for "for" loop
 * Problem: Write a Program to print the Even Numbers 
 *          between 1 and 100
 * @author Anthoniraj Amalanathan
 * @since 01-Aug-2022
 */
public class ForLoopDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
