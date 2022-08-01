package edu.vit.corejava.basics;

import java.util.Scanner;
/*
 * Guess the Number Game
 * @author Anthoniraj Amalanathan
 * @since 01-Aug-2022
 */

public class GuessingGame {
    public static void main(String[] args) {
        int answer = 23;
        Scanner sc = new Scanner(System.in);
        System.out.print("What Number am i thinking of? ");
        while (true) {
            int guessedNumber = sc.nextInt();
            if (guessedNumber < answer) {
                System.out.println("Little Higher!");
            } else if (guessedNumber > answer) {
                System.out.println("Little Lower!");
            } else { // guessedNumber == answer
                System.out.println("Mind Reader!");
                break; // Will terminate the loop
            }
        }
    }
}