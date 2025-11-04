import java.io.*;
import java.util.Scanner;

public class Cat {
    public static void cat(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.print("");
        }

        File file = new File(args[0]);
        String data = "";
        try (Scanner reader = new Scanner(file)) {
            while (reader.hasNext()) {
                data += reader.nextLine() + "\n";
            }
        }
        System.out.print(data);
    }
}