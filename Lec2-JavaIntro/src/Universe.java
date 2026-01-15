import java.util.*;

/**
 * @author SAer
 */
public class Universe {

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hello World");

        int x=100;
        int y=100;
        System.out.println("the values are" + x + ","+  y);
        System.out.println("the total sum is " + (x +  y));

        Scanner input=new Scanner(System.in);
        System.out.println("Enter number");
        double a= input.nextInt();
        int b= input.nextInt();
        String name= input.next();

        System.out.println("the value entered is" + a + " " + b + "Name is " + name);

        System.out.println("Enter statement");
        String line = input.nextLine();

        System.out.println("the string entered is" + line);

    }
}