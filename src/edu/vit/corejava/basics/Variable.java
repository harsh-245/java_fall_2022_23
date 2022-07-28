/*
 * Variable Demo
 * @author Anthoniraj Amalanathan
 * @since 28-Jul-2022
 */

public class Variable {
    public static void main(String[] args) {
        int minimumTemperature = 28; // Stack Memory
        System.out.println(minimumTemperature);

        String name = "Anthoniraj";
        System.out.println(name.toUpperCase());

        Integer y = 23; // Heap Memory
        System.out.println(Constant.MIN_CREDITS);
    }
}
