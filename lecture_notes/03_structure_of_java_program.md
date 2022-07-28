# Structure of Java Program
- Author: `Anthoniraj Amalanathan`
- Date: 27-Jul-2022

```java
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```
- Every java program must start with `class` or `interface`
- `public` is a keyword which indicates the visibility (Available anywhere)
- You may have number of classes in a Java Program but only one class must be `public` 
- `main` method is the entry point of Java program execution.
- `main` method is `static` because it does not require an object to invoke.
- `main` method does not return anything, hence declared as `void`.
- `main` method takes one `String array` as an argument.
- `main` method argument or parameter name can be anything (E.g. Instead of args, you can use `params` or `anyMeaningfulName`)
- `main` method signature should be either
```java
public static void main(String[] args)
```
- or
```java
public static void main(String... args)
```
- Triple dots (...) is a variable arguments or varargs in java which can be used as a parameter in any method. You can pass `n` number of arguments while invoking the method.
- `System.out.println` is a method for displaying text in console or terminal window.
- Note: In java, we call function as "method" inside the class



