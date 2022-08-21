package edu.vit.corejava.oop;

public class Employee {
    private String name;
    private Double salary;

    public String toString() {
        return "Name: " + this.name + " Salary: " + this.salary;
    }

    public Employee() {

    }

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(Employee emp) {
        this.name = emp.name;
        this.salary = emp.salary;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Kumar", 123456.50);
        Employee newEmployee = new Employee(employee);
        System.out.println(employee.toString());
    }
}
