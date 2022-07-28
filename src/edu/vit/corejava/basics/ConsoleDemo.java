package edu.vit.corejava.basics;

import java.io.Console;

/*
 * Console Input Demo
 * @author Anthoniraj Amalanathan
 * @since 28-Jul-2022
 */

public class ConsoleDemo {
    public static void main(String[] args) {
        Console con = System.console();
        System.out.print("Enter the username: ");
        String name = con.readLine();
        System.out.print("Enter the password: ");
        String password = String.valueOf(con.readPassword());
        System.out.println(name + " " + password);

    }
}
