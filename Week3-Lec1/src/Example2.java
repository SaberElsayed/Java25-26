
/**
 * Input/Output: Example3_7 in the book
 * Saber Elsayed
 *
 * @version 1.1
 */
public class Example2 {

    public static void main(String[] args) {
        // Declare and initialize an integer variable
        int num = 763;

        // Declare and initialize a double (floating-point) variable
        double x = 658.75;

        // Declare and initialize a String variable
        String str = "Java Program.";

        //  to show column positions
        System.out.println("1234567890123456789"
                + "01234567890");

        // %-5d  -> left-aligned integer, width 5
        // %-7.2f -> left-aligned double, width 7, 2 decimal places
        // %-15s -> left-aligned string, width 15
        // ***   -> literal text
        System.out.printf("%-5d%-7.2f%-15s ***%n",
                num, x, str);

        // %-15s -> left-aligned string, width 15
        // %-6d  -> left-aligned integer, width 6
        // %-9.2f -> left-aligned double, width 9, 2 decimals
        System.out.printf("%-15s%-6d%-9.2f ***%n",
                str, num, x);

        // %-8.2f -> left-aligned double, width 8, 2 decimals
        // %-7d   -> left-aligned integer, width 7
        // %-15s  -> left-aligned string, width 15
        System.out.printf("%-8.2f%-7d%-15s ***%n",
                x, num, str);

        // Print the integer variable with formatting
        System.out.printf("num = %-5d ***%n", num);

        // Print the double variable with width 10 and 2 decimals
        System.out.printf("x = %-10.2f ***%n", x);


        // Print the string variable with width 15
        System.out.printf("str = %-15s ***%n", str);

        // Print a string and an integer with alignment
        System.out.printf("%-10s%-7d ***%n",
                "Program No.", 4);
    }

}
