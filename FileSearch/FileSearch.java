import java.io.File;
import java.util.ArrayList;
import java.util.List;
public class FileSearch {
    public static String searchFile(String fileName) {
        ArrayList<String> directories = new ArrayList<>(List.of("documents")); 
        String filePath = "";

        while (directories.size() != 0 && filePath.isEmpty()) {
            File dir = new File(directories.remove(0));
            File[] files = dir.listFiles();
            if (files == null) {
                break;
            }
            for (File file : files) {
                if (file.isDirectory()){
                    directories.add(dir + "/" + file.getName());
                } else if (file.getName().equals(fileName)) {
                    filePath = dir + "/" + file.getName();
                }
            }
        }
        return filePath;
    }

}