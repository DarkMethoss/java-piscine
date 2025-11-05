import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
        String content = Files.readString(Path.of(args[0]));
        String[] words = content.trim().split("\\s+");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() > 0) {
                words[i] = Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
            }
        }
        String result = String.join(" ", words);
        Files.writeString(Path.of(args[1]), result);
    }
}