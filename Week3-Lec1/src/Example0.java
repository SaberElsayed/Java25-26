/**
 * Read data from user using Scanner and stops if they enter -1 and calculates the total sum
 *
 * @author: Saber Elsayed
 * @version 1
 * @since Jan 2026
 */

import java.util.Scanner;

public class Example0 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0, num;
        System.out.println("Enter a series of numbers ending with -1:");

        while (true) {
            num = input.nextInt(); // read int- for doulbe: .nextDouble()
            if (num == -1) {
                break;
            }
            total += num;
        }
        System.out.println("The total number is " + total);
    }


}
