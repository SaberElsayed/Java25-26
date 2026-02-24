/**
 * Learning basics of arrays
 *
 * @author Saber Elsayed
 * @version 1.0
 */

import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {


        int[] a = new int[]{1, 2, 3, 4, 5}; // one way to define an array
        int[] b = {1, 2, 3, 4, 5}; // another way to define an array

        // this will give an error
//        int [] c;
//        c ={1,2,3,4,5};

        // initialize an array with random values from 0 to 100
        int[] c = new int[5];
        for (int i = 0; i < c.length; i++) {
            c[i] = (int) (Math.random() * 100);

        }
        // you can use for loops to print value
        //  for(int i=0;i<a.length;i++){
        //     System.out.print(a[i] + "\t");
        //  }
        //  System.out.println();
        // we defined a method to print the content of  int arrays
        ArraysClass s = new ArraysClass(); // created an object as the method is not static
        s.print(a);
        s.print(b);
        s.print(c);

        // another array with double values
        double[] d = new double[5];
        for (int i = 0; i < c.length; i++) {
            d[i] = Math.random() * 1000;

        }
        // used the second method that deals with double
        s.print(d);
        // another way is to use Arrays.toString
        System.out.println(Arrays.toString(d));

        // check if 2 arrays are the same
        boolean same = true;
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    same = false;
                    break;
                }

            }
        } else {
            same = false;
        }
        System.out.println(same);

        // check if 2 arrays are the same using the Arrays class
        System.out.println(Arrays.compare(a, b));

        int maxVal = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > maxVal) {
                maxVal = a[i];
            }
        }
        System.out.println(maxVal);

        double[] e = new double[5]; // new array

        // one way to copy the content of an array
//        for (int i = 0; i < e.length; i++) {
//            e[i]= d[i];
//        }
//        s.print(e);

        // another way to copy the content
        System.arraycopy(d, 2, e, 0, 3);
        s.print(e);

        Person[] pArray = new Person[3];
        pArray[0] = new Person(1, "Saber");
        pArray[1] = new Person(2, "Mohamed");
        pArray[2] = new Person(3, "Mahmoud");
        for (int i = 0; i < pArray.length; i++) {
            System.out.println("Person#"+ (i+1)+ "'s info is: " + pArray[i]);
        }


    }

    /**
     * Print content of an array
     * @param array: int
     */
    public void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }
    /**
     * Print content of an array
     * @param array: double
     */
    public void print(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

}
