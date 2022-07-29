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
        PrintWriter out = new PrintWriter(System.out);
        out.println("Hi There!");
        out.flush();
        System.out.println("Second Line");
        logger.info("This is an information!");
        logger.warning("Be careful!");
        logger.severe("Error Happened!");

    }
}