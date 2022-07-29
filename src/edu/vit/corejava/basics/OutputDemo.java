package edu.vit.corejava.basics;

import java.io.PrintWriter;
import java.util.logging.Logger;

/*
 * Demo Program for Output
 * @author Anthoniraj Amalanathan
 * @since 28-Jul-2022
 */

public class OutputDemo {
    public final static Logger logger = Logger.getLogger("global");

    public static void main(String[] args) {
        /* Method-1 using PrintWriter */
        PrintWriter out = new PrintWriter(System.out);
        out.println("Hi There!");
        out.flush();

        /* Method-2 using System.out.print */
        System.out.println("Second Line");

        /* Method-3 using Logger */
        logger.info("This is an information!");
        logger.warning("Be careful!");
        logger.severe("Error Happened!");

    }
}