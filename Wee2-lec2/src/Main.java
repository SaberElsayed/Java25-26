import java.util.Scanner;

/**
 * This class is for control structures and loops in java
 */
public class Main {
    public static void main(String[] args) {

        //if-else
        int mark = 65;
        if (mark >= 60) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // get input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mark");
        mark = sc.nextInt();
        // if-else if- else
        if (mark >= 90) {
            System.out.println("A");
        } else if (mark >= 80) {
            System.out.println("B");
        } else if (mark >= 70) {
            System.out.println("C");
        } else if (mark >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        // switch
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter an option");
        int option = sc2.nextInt();
        switch (option) {
            case 0:
            case 1:
                System.out.println("Hello ");
                break;
            case 2:
                System.out.println("Hello Hello ");
                break;
            default:
                System.out.println("Wrong option");

        }

        // for loop
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello " + i);
        }

        // while loop
        int i = 0;
        while (i < 10) {
            System.out.println("Hello while loop " + i);
            i++;
        }

        // do-while,
        int j = 0;
        do {
            System.out.println("Hello do-while loop " + i);
            j++;
        } while (j < 10);
    }
}