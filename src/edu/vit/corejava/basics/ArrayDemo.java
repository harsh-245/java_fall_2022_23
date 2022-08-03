package edu.vit.corejava.basics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collector;

import javafx.print.Collation;

/*
 * Java Arrays Demo
 * @author Anthoniraj Amalanathan
 * @since 02-Aug-2022
 */

public class ArrayDemo {
    public static void main(String[] args) {
        /* Array is a collection of similar data */
        int intArray[] = new int[5];
        intArray[0] = 10;
        intArray[1] = 5;
        intArray[2] = 4;

        int values[] = { 1, 2, 3, 4, 5 };
        int matrixA[][] = { { 1, 2 }, { 3, 4 } };

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        ArrayList<Integer> iValues = new ArrayList<Integer>();
        iValues.add(10);
        iValues.add(20);
        iValues.add(8);
        System.out.println("**********");
        System.out.println(iValues);
        Collections.sort(iValues);
        System.out.println(iValues);
        System.out.println("************");

        for (int i = 0; i < iValues.size(); i++) {
            System.out.println(i + " " + iValues.get(i));
        }
        System.out.println("*********************");
        for (Integer value : iValues) {
            System.out.println(value);
        }

    }
}