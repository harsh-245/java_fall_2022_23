package edu.vit.corejava.error;

/**
 * Run Time Error Demo
 * 
 * @author Anthoniraj Amalanathan
 * @since 25-Aug-2022
 */

public class RunTimeError {
    public static void main(String[] args) {
        Integer values[] = new Integer[3];
        values[0] = 10;
        values[1] = 20;
        values[2] = 30;
        values[4] = 40;
        System.out.println(values.toString());
        /*
         * Other Statements
         */

    }
}