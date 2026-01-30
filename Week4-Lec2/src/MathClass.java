/**
 * Learning some methods in the  Math class
 *
 * @version 1
 * @author: Saber Elsayed
 * @since Jan 2026
 */
public class MathClass {
    public static void main(String[] args) {

        final double PI = Math.PI;
        System.out.println("Are of a cricle with r=5: " + 2 * PI * 5 * 5); // PI

        double delta = 100;
        Double value = Math.tan(90); // tan
        System.out.println("The tan of " + value + " is: " + value);

        value = Math.sin(90);
        System.out.println("The sin of " + value + " is: " + value); // sin

        value = Math.cos(90);
        System.out.println("The cos of " + value + " is: " + value); // cos

        value = Math.sqrt(100);
        System.out.println("The sqrt of " + value + " is: " + value); // square root

        value = 5.0;
        System.out.println("The power of 5 is: " + Math.pow(value, 5));

        value = Math.log10(value);
        System.out.println("The log10 of " + value + " is: " + value);

        value = 5.4;
        System.out.println("The ceil of " + value + " is: " + Math.ceil(value));
        System.out.println("The floor of " + value + " is: " + Math.floor(value));

        value = 2.0;
        System.out.println("The exp of " + value + " is: " + Math.exp(value));

        value = 2.7;
        System.out.println("The round of " + value + " is: " + Math.round(value));


        value = 2.3;
        System.out.println("The round of " + value + " is: " + Math.round(value));

        value = 2.3;
        //Returns the double value that is closest in value to 2.3
        System.out.println("The round of " + value + " is: " + Math.rint(value));

        int lowerBound=50, upperBound=100;
        int randValue= lowerBound + (int)(Math.random()*(upperBound-lowerBound));
        System.out.println(" A random integer value between " + lowerBound + " and " + upperBound + " is " + randValue);

        // return a double value within a range
        double randValue2= lowerBound + (Math.random()*(upperBound-lowerBound));
        System.out.println(" A random double value between " + lowerBound + " and " + upperBound + " is " + randValue2);


    }

}