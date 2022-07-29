# Java Input and Output
- Author: `Anthoniraj Amalanathan`
- Dates: 27-Jul-2022 and 28-Jul-2022

## Types of Input
1. Through Command Line Arguments
2. Using Console Class
3. Using Scanner Class

### Through Command Line Arguments
Try this method only in VSCode directly creating a Java Program (without project) and run the program using `javac` and `java` command in `VSCode Terminal`.

```java
public class App {
    public static void main(String[] args) {
        System.out.println(args[0] + " " + args[1]);
    }
}
```
- Compile the program `javac App.java`
- Run the class `java App 10 20`
- Output: `10 20`
- 10 and 20 are the command line arguments can be directly passed to main method at the time of running a Java Program.

### Console Class
- Console class has two methods `readLine()` and `readPassword()` for getting input from the keyboard.

```java
package edu.vit.corejava.basics;

import java.io.Console;

/*
 * Console Input Demo
 * @author Anthoniraj Amalanathan
 * @since 28-Jul-2022
 */

public class ConsoleDemo {
    public static void main(String[] args) {
        Console con = System.console();
        System.out.print("Enter the username: ");
        String name = con.readLine();
        System.out.print("Enter the password: ");
        String password = String.valueOf(con.readPassword());
        System.out.println(name + " " + password);

    }
}
```

### Scanner Class
- `Scanner` is the standard class in Java for getting Console Input
- You can get the required data type using `Scanner` instead of always 'String' like Console Class

```java
package edu.vit.corejava.basics;

import java.util.Scanner;

/*
 * Scanner Input Demo
 * @author Anthoniraj Amalanathan
 * @since 28-Jul-2022
 */

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number-1: ");
        int numberOne = sc.nextInt();
        /*
         * This is required if you are using more than one method from scanner
         * class continuously except nextLine()
         */
        sc.nextLine();
        System.out.print("Enter Number-2: ");
        int numberTwo = sc.nextInt();

        System.out.println("The Addition is " + (numberOne + numberTwo));
    }
}
```
## Types of Output
### Using PrintWriter

```java
    import java.io.PrintWriter;

    public class OutputDemo {
        public static void main(String[] args) {
            PrintWriter out = new PrintWriter(System.out);
            out.println("Hi There!");
            out.flush();
        }
    }
    
```
### using System.out.println()
- You can use `System.out.print()` or `System.out.println()` to display the `output in console window`.
    - `System.out.print()` - use this method without newline after output
    - `System.out.println()` - use this method with newline after output
- It is always recommended to use logger instead of `System.out.println()` in real time projects.

### Using Logger
- provides the ability to trace out the errors of the applications.

```java
    import java.util.logging.Logger;
    public class OutputDemo {
        public final static Logger logger = Logger.getLogger("global");
        public static void main(String[] args) {       
            logger.info("This is an information!");
            logger.warning("Be careful!");
            logger.severe("Error Happened!");

        }
    }
```
