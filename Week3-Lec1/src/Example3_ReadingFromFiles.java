
/**
 * read data from a file
 * Saber Elsayed
 *
 * @version 1.1
 */
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Example3_ReadingFromFiles {
    public static void main(String[] args) {
        int total = 0, value;

        // reading data from a file
        try {
            // use a Scanner object, but read the file you want using FileReader
            Scanner inFile = new Scanner(new FileReader("data.txt"));
            while (inFile.hasNext()) { // keep reading until the last data
                value = inFile.nextInt();
                total += value;
            }
            inFile.close(); // close the object variable to release any resources

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found");
        }

        System.out.println("Total number of input files" +  total);


        try {
            FileWriter fw = new FileWriter("output.txt" ); // creating the file to write in
            fw.write("Total number of input files" + total); // write to a file
            fw.close();
        } catch (IOException e) {
            System.out.println("Error: File writing");
        }

    }
}
