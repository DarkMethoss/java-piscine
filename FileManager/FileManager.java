import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class FileManager {


    public static void createFile(String fileName, String content) throws IOException {
        Files.writeString(Path.of(fileName), content);
    }
    public static String getContentFile(String fileName) throws IOException {
        byte[] content = Files.readAllBytes(Path.of(fileName));
        return new String(content);
    }
    public static void deleteFile(String fileName) {
        new File(fileName).delete();
    }
}