package Step4;

import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFour {
    /**
     * Yes, you can look at the other
     * examples in this lab to build your solution here.
     */
    public static void main(String[] args) {
        try {


            File starting = new File(System.getProperty("user.dir"));
            Scanner fileIn = new Scanner(new File(starting, "Step4/input.txt"));

            int sum = 0;
            while (fileIn.hasNext()) {
// Reads the current line and converts it to an integer
                int number = Integer.parseInt(fileIn.nextLine());
                sum += number;

                // Print the running total
                System.out.println(sum);

            }
        } catch (IOException e) {
            System.out.println("File not found");
            // Print out a running total of all the
            // values in the input file.
        }
    }
}