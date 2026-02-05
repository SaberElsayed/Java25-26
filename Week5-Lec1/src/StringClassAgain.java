import java.util.Scanner;

/**
 * This class is for week 2, lecture 1
 * it is about the String class, double/float and logical errors
 *
 * @author Saber Elsayed
 * @version 1.1
 * @since: 20/01/2026
 */
public class StringClassAgain {
    /**
     * this is the main method to run
     *
     * @param args input parameters
     */
    public static void main(String[] args) {


        double a = 0.555555176876871;

        double updatedA = Math.round(a * 1000) / 1000.0;

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


        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'e') {
                System.out.println("location is " + i);
                break;
            }
        }

        text = "Hello EveryONE";

        System.out.println(text.indexOf("e"));
        System.out.println(text.lastIndexOf("e"));

        System.out.println(text.substring(4, 8));

        System.out.println(text.endsWith("Ne"));


        // ask user to enter their name
        System.out.println("Please enter your name");
        //store it in a variable
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        // locate the location for space

        int location = name.indexOf(" ");
        // the first name is the substring from 0 upto the location of the sapce

        System.out.println("First name is: " + name.substring(0, location));

        // the last the substring starting one location after the location of the sapce

        System.out.println("Last name is: " + name.substring(location + 1));


        double yy = 5.5;
        int yInt = (int) yy;

        String value1 = "50.5";
        String value2 = "150.7";

        // int total = Integer.parseInt(value1)+ Integer.parseInt(value2);
        double total = Double.parseDouble(value1) + Double.parseDouble(value2);
        System.out.println(total);

        //---------------------Palindrome------------------
        System.out.println("---------------------Palindrome------------------");
        // ask user to enter a word
        System.out.println("Please enter a word: ");

        // store the word
        Scanner input2 = new Scanner(System.in);
        String word = input2.nextLine().replace(" ", "");
        // reverse it
        String reversedWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }

        // compare both words
        System.out.println(word.equalsIgnoreCase(reversedWord));

    }

}