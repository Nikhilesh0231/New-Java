
import java.io.*;

public class Filereadersubclass {

    public static void main(String[] args) {
        try {
            // Create a new file reader
            FileReader fileReader = new FileReader("first.txt");
            // Read the file
            int i;
            while ((i = fileReader.read()) != -1 ) {
                System.out.print((char) i);
            }
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        //example for Writer class
        try {
          // Create a new file writer
          FileWriter fileWriter = new FileWriter("first.txt");
          // Write to the file
          fileWriter.write("Hello, World! Nikhilesh");
          fileWriter.close();
          } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
            }


    }
}
