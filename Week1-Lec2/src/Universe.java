import java.util.Scanner;

/**
 * <b> Saber Elsayed
 * </b>
 * This class shows simple java commands, like println, variables and scanner
 *
 * @author Saber Elsayed
 */
public class Universe {
    // main method
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hello World");

        int x = 100;
        int y = 100;
        System.out.println("the values are" + x + "," + y);
        System.out.println("the total sum is " + (x + y));

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        double a = input.nextDouble(); // reads floating-point data
        int b = input.nextInt(); // reads an integer
        String name = input.next(); // reads a string
        input.nextLine(); // consume leftover newline but does not store it
        System.out.println("the value entered is" + a + " " + b + "Name is " + name);

        System.out.println("Enter statement");
        String line = input.nextLine(); // reads whole line

        System.out.println("the string entered is" + line);

    }
}