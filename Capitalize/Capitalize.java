import java.io.*;
import java.util.Scanner;

public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
        File input = new File(args[0]);

        try (Scanner scanner = new Scanner(input)) {
            FileWriter writer = new FileWriter(args[1],true);
            while (scanner.hasNext()) {
                String word = scanner.next();
                String capitalized = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                if (scanner.hasNext()) {
                    capitalized += " ";
                }
                writer.write(capitalized);
            }
            writer.close();
        }
    }

}