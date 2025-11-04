import java.io.*;

public class CatInFile {
    public static void cat(String[] args) throws IOException {
        try (OutputStream out = new FileOutputStream(args[0])) {
            byte[] buffer = new byte[1024 * 8];
            int b;
            while ((b = System.in.read(buffer)) != -1) {
                out.write(buffer,0,b);
            }
        }
    }
}
