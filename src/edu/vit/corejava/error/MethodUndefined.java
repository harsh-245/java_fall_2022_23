package edu.vit.corejava.error;

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

public class MethodUndefined {
    public static void main(String[] args) {
        Employee employee = new Employee("Kumar");
        System.out.println(employee.setNaem()); // Spelling mistake in method name
    }
}