/**
 * This class is for week 2, lecture 1
 * it is about the String class, double/float and logical errors
 *
 * @author Saber Elsayed
 * @version 1.1
 * @since: 20/01/2026
 */
public class Main {
    /**
     * this is the main method to run
     *
     * @param args input parameters
     */
    public static void main(String[] args) {
        double a = 0.555555176876871;
        System.out.println((float) a); // cast double to float

        float b = 0.555555176876871f; // we need to use f to define a variable of type float
        System.out.println(b);

        String text = "Hello EveryONE";

        System.out.println(text.length());// get the length of the string
        System.out.println(text.charAt(0)); // returns char at location 0
        System.out.println(text.contains("E")); // returns T/F if string exists
        System.out.println(text.contains("Saber"));// check if the text contains "Saber"
        System.out.println(text.toLowerCase());// convert it lower case
        System.out.println(text.toUpperCase()); // convert the text to uppercase
        System.out.println(text.replace(" ", "!!!"));
        System.out.println(text.replace("e", "yyyyyyyyy"));
        System.out.println(text.equals("Hello everyONE"));// is the text saved equal to "Hello everyONE"

        System.out.println(text.isEmpty()); // check if the text is empty
        System.out.println(text.equalsIgnoreCase("Hello everyONE")); // compare two texts ignoring the case
        System.out.println(text.substring(1, 5)); // take a portion/subset of the text from index 0 to index 5


        text = text.replace("e", "yyyyyyyyy"); // this will update the original text
        System.out.println(text);

        System.out.println((8 / 2) + 7 * 2 - (10 / 2) + (8 % 3));// the expected outcome is 15


        //System.out.println(1/0); // run time error
        int cc = 032;
        System.out.println(cc); // this will print the number in an octal system, as the number starts with 0

    }

}