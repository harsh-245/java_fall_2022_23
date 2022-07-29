# Variables and Datatypes in Java
Variables are containers used for storing value. Values are stored according to its type
- Syntax: `datatype variableName = value;`
int minimumTemperature = 10;

- datatype-1: primitive date types
    - byte 
    - short 
    - `int`
    - long
    - `char`
    - `float`
    - double
    - `boolean`
- datatype-2: Object Data Types (Non-primitive)
    - java.lang.String
    - List

## Wrapper Class
- mechanism to convert primitive into object
    - int => Integer
    - float => Float
    - double => Double
    - boolean => Boolean
    
## Types of variables in Java
    1. local variable
    2. static variable
    3. instance variable

## Constant in Java
- value that cannot be changed.
- Syntax: `static final datatype IDENTIFIER_NAME=value;`

```java
    public class ConstantDemo {
        public static final double PI = 311415;
        public static final int MIN_CREDITS = 16;
    }
```



