import java.util.Scanner;

/**
 * Demo Program for Do while Loop
 * 
 * @author Anthoniraj Amalanathan
 * @since 22-Aug-2022
 */
public class DoWhileLoopDemo {
    public static void main(String[] args) {
        String flag;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Hello"); // Sample Output
            System.out.print("Do you want to display again: ");
            flag = sc.nextLine();
        } while (flag.equalsIgnoreCase("Yes"));
    }
}
