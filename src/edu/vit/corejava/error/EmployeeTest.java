package edu.vit.corejava.error;

/**
 * Java Compile Time Error Demo
 * 
 * @author Anthoniraj Amalanathan
 * @since 25-Aug-2022
 */
class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String toString() {
        return "Employee [name=" + name + "]";
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        System.out.println(new Employee("Kumar").toString());
    }
}