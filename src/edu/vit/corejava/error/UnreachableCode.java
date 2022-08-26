package edu.vit.corejava.error;

/**
 * Java Compile Time Error Demo for Unreachable Code
 * 
 * @author Anthoniraj Amalanathan
 * @since 25-Aug-2022
 */

class Employee {
    private String name;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public String concatUpper(String message) {
        String newStr = message + this.name;
        newStr.toUpperCase();
        return newStr;

    }
}

public class UnreachableCode {
    public static void main(String[] args) {
        Employee employee = new Employee("Kumar");
        System.out.println(employee.concatUpper("Welcome"));
    }
}
