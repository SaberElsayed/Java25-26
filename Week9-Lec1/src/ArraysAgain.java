/**
 * Working with Arrays: 1-D and 2-D
 * LinkedList and ArrayList
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class ArraysAgain {
    public static void main(String[] args) {
        int[] a = {23, 3, 5, 44, 50, 65, 77, 80};
        int[] b = {23, 3, 5, 44, 50, 65, 77, 80};

        // a new way for printing the content of an array
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " \t");
        }
        System.out.println();
        for (int value : a) {
            System.out.print(value + "\t");
        }
        System.out.println();
        //sorting
        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println(Arrays.toString(a));
//
        System.out.println(Arrays.equals(a, b));


        System.out.println(Arrays.compare(a, b));
        //binary search
        System.out.println(Arrays.binarySearch(a, 25));


        // check two arrays are the same

        System.out.println("-------2D ARRAYS---------");
        // define a 2D array

        int[][] a2D = new int[3][4];
        // initialize a 2D array with random values from 0 to 10

        for (int i = 0; i < a2D.length; i++) {
            for (int j = 0; j < a2D[i].length; j++) {
                a2D[i][j] = (int) (Math.random() * 10);
            }
        }

        System.out.println("-------------------------");
        // print 2D array
        for (int i = 0; i < a2D.length; i++) {
            for (int j = 0; j < a2D[i].length; j++) {
                System.out.print(a2D[i][j] + " \t");
            }
            System.out.println();
        }

        System.out.println("-------------------------");
        // find total sum in each row
        int sum;
        for (int i = 0; i < a2D.length; i++) {
            sum = 0;
            for (int j = 0; j < a2D[i].length; j++) {
                sum += a2D[i][j];
            }
            System.out.println("The total sum of values in row#" + i + " is = " + sum);
        }


        System.out.println("-------------------------");
        // find max in each row

        for (int i = 0; i < a2D.length; i++) {
            int max = a2D[i][0];
            for (int j = 0; j < a2D[i].length; j++) {
                max = Math.max(max, a2D[i][j]);

//                if(a2D[i][j]>max){
//                    max= a2D[i][j];
//                }
                System.out.println("The maximum number in row#" + i + " is = " + max);
            }
        }

        System.out.println("-------------------------");


        System.out.println("--------ARRAY LIST-------");
        // initialize an ARRAY LIST

        // add to the array list
        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(1);
        aList.add(225);
        aList.add(25);
        aList.add(30);
        aList.add(45);

        // remove from an array list: it removes by the index not the value
        aList.remove(2);

        // to get an element from the list
        System.out.println("the elemet at index 1 is: " + aList.get(1));

        // check if the list contains a value
        System.out.println("does the list contain a value of 225? " + aList.contains(225));
        //size of the list
        System.out.println("the size of the list is " + aList.size());

        // reverse
        System.out.println("the list in a reverse order " + aList.reversed());

        //sort
        Collections.sort(aList);
        System.out.println(aList);


        // clear the list
        aList.clear();

        //linked list
        LinkedList<Integer> aList2 = new LinkedList<>();
        aList2.add(25);
        aList2.add(30);
        aList.remove(0);
        //... try more methods

    }
}
