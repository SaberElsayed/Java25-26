/**
 * This class is for week 2, lecture 1
 * it is about String and other stuff
 *
 * @author Saber Elsayed
 * @version 1.1
 * @date:
 */
public class Main {
    /**
     * this is the main function
     *
     * @param args
     */
    public static void main(String[] args) {
        double a = 0.555555176876871;
        System.out.println((float) a);

        float b = 0.555555176876871f;
        System.out.println(b);

        String text = "Hello EveryONE";
        // get length
        System.out.println(text.length());
        System.out.println(text.charAt(0)); // returns char at location 0
        System.out.println(text.contains("E")); // returns T/F if string exists
        System.out.println(text.contains("Saber"));
        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());
        System.out.println(text.replace(" ", "!!!"));
        System.out.println(text.replace("e", "yyyyyyyyy"));
        System.out.println(text.equals("Hello everyONE"));

//        text= text.replace("e", "yyyyyyyyy");
        System.out.println(text);

        System.out.println(text.isEmpty());
        System.out.println(text.equalsIgnoreCase("Hello everyONE")); // compare two text ignoring the case
        System.out.println(text.substring(1, 5));

        System.out.println((8 / 2) + 7 * 2 - (10 / 2) + (8 % 3));


        System.out.println("Saber");
        //System.out.println(1/0); // run time error
        int cc =32;
        System.out.println(cc);
    }

}