package edu.vit.corejava.oop;

/**
 * Demo program for array of objects using Student Class
 * Also discuss about CRUD - Create / Retrieve / Update / Delete
 * - For Create - Use Parameterized Constructor
 * - For Update - Use Setter Methods
 * - For Retrieve - Use Getter / toString Method
 * - For Delete - Set object as NULL
 * 
 * @author Anthoniraj Amalanathan
 * @since 18-Aug-2022
 * @version 1.0
 */

class Student {
    private String registerNumber;
    private String name;
    private Double javaMark;
    private Integer totalCredits;

    /* No Arg Constructor */
    public Student() {
    }

    /* Parameterized Constructor */
    public Student(String registerNumber, String name, Double javaMark, Integer totalCredits) {
        this.registerNumber = registerNumber;
        this.name = name;
        this.javaMark = javaMark;
        this.totalCredits = totalCredits;
    }

    /* Getter and Setter Methods */
    public String getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getJavaMark() {
        return javaMark;
    }

    public void setJavaMark(Double javaMark) {
        this.javaMark = javaMark;
    }

    public Integer getTotalCredits() {
        return totalCredits;
    }

    public void setTotalCredits(Integer totalCredits) {
        this.totalCredits = totalCredits;
    }

    /* To String Method to return Object Properties Value as String */
    public String toString() {
        return "Student [registerNumber=" + registerNumber + ", name=" + name + ", javaMark=" + javaMark
                + ", totalCredits=" + totalCredits + "]";
    }

}

public class StudentTest {
    /* This is the Test class for Student */
    public static void main(String[] args) {
        /* Syntax for creating array of Objects */
        Student student[] = new Student[10];
        student[0] = new Student("BCE100", "Jerry", 76.5, 3);
        student[1] = new Student("BCE101", "Karolyn", 82.5, 3);
        student[2] = new Student("BCB205", "Derby", 54.5, 3);

        /*
         * You can call different types of constructor as per requirement
         * The new Student() will call no arg constructor and ALL properties
         * of this Object (student[3]) will be initialized as NULL
         */
        student[3] = new Student();
        System.out.println(student[3].toString());

        /* Update Student BCB205 Java Mark */
        student[2].setJavaMark(60.5);
        System.out.println(student[2].toString());

        /* Retrieve Java Mark of BCE101 */
        System.out.println(student[1].getRegisterNumber() + ": " + student[1].getJavaMark());

        /**
         * Output
         * Student [registerNumber=null, name=null, javaMark=null, totalCredits=null]
         * Student [registerNumber=BCB205, name=Derby, javaMark=60.5, totalCredits=3]
         * BCE101: 82.5
         */
    }
}