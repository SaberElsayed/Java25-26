import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int mark = 65;
        if (mark >= 60) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mark");
        mark = sc.nextInt();
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


           Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter an option");
        int option = sc2.nextInt();
        switch (option) {
            case 0:
            case 1: System.out.println("Hello "); break;
            case 2: System.out.println("Hello Hello "); break;
            default: System.out.println("Wrong option");

        }

        for (int i=0; i<100; i++) {
            System.out.println("Hello " + i);
        }
        int i=0;
        while (i<100) {

            i++;
        }

        int j=1000;
        do {


            j++;
        } while (j<100);
    }
}