# Common Compile Time Errors
- Author: Anthoniraj Amalanathan
- Date Last Modified: 25-Aug-2022

## What is an Error in Program?
- mistakes in a program that prevents it from working condition.
- Three types of error
    - Compile Time Error
    - Logical Error
    - Runtime Error
- This document discuss about the compile time and logical errors.

## Unresolved compilation problem
- `Exception in thread "main" java.lang.Error: Unresolved compilation problem`
- This happens when the `public class` keyword used other than `Java File Name`
- Example: Java File Name: `Employee.java` but public class is `EmployeeTest`
- Solution: File must be renamed as `EmployeeTest.java`
```java
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
```

## The method is undefined
- Reason-1: There might be spelling mistake in method name.
- Reason-2: The method might not have been created in class.
- Example
```java
class Employee {
    private String name;
    public Employee(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}
public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Kumar");
        System.out.println(employee.getNaem()); // Spelling mistake in method name
    }
}
```

## Syntax error, insert ";" to complete Statement
- Check the Line Number displayed in Error Message
- Add a "semicolon;" at the end of that statement
```java
public class EmployeeTest {
    public static void main(String[] args) {
        System.out.println("Welcome to Java") // Semicolon (;) missing
    }
}
```

## Syntax error on token ",", ; expected
- Reason - comma(,) was used instead semicolon (;)
- Example
```java
public class EmployeeTest {
    public static void main(String[] args) {
        // should be for (int i = 0; i < 3; i++) 
        for (int i = 0, i < 3; i++) { 
            System.out.println(i);
        }
    }
}
```

## String literal is not properly closed by a double-quote
- Reason: The staring is not properly closed with double quote
```java
import java.time.LocalDate;
public class EmployeeTest {
    public static void main(String[] args) {
        //should be closed with double quote
        System.out.println("Sample program to display current date: ); 
        System.out.println(LocalDate.now());
    }
}
```

## Logical Mistake: Using Logical Operators
- Write a Java Program for checking given name has only alphabets and minimum 3 characters
```java
public class EmployeeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        if (name.matches("[a-z]+") && name.length() < 3) {
            System.out.println("Invalid Input");
        } else {
            System.out.println(name);
        }
    }
}
```
