import java.io.*;
import java.util.Scanner;

public class ReadingDataFromFilesAgain {

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new FileReader("data.txt"));
            FileWriter fw = new FileWriter("outputData.txt");

           while (input.hasNext()) {
              // System.out.print(input.nextInt() + " \t");

               fw.write(String.valueOf(input.nextInt()));

           }

           input.close();
           fw.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
