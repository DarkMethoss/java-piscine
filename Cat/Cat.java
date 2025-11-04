import java.io.*;

public class Cat {
    public static void cat(String[] args) throws IOException {
        if (args == null || args.length == 0) {
            return;
        }
        
        try (FileInputStream fileStream = new FileInputStream(args[0])) {
            System.out.write(fileStream.readAllBytes());
        }
    }
}