import java.io.*;

public class CatInFile {
    public static void cat(String[] args) throws IOException {
        try (OutputStream out = new FileOutputStream(args[0])) {
            int b;
            while ((b = System.in.read()) != -1) {
                out.write(b);
            }
        }
    }
}
