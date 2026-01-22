/**
 * Input/Output
 * Saber Elsayed
 * @version 1.0
 * @since Jan 2026
 */
public class Example1 {
    public static void main(String[] args) {
        int num = 96;
        double rate = 15.50;

        System.out.println("123456789012345");

        // %5 means 5 places - aligned to the right by default;
        // %n: move to the next line
        System.out.printf("%5d %n", num);

        //%5.2f: width is 5, with exactly 2 digits after the decimal point, f means float
        // . is counted too
        System.out.printf("%5.2f %n", rate);

        // %5d the first variable: num, is formatted as integer (d) with width 5
        // %6.2f: rate (the second variable) is formatted as float with width 6 and 2 digits after the decimal point
        System.out.printf("%5d%6.2f %n", num, rate);

        // %5d the first variable (num) is formatted as integer (d) with width 5
        // %6.2f: rate (the second variable) is formatted as float with width 6 and 2 digits after the decimal point
        // but there is an extra space between the two numbers
        System.out.printf("%5d %6.2f %n", num, rate);

    }
}