package _07_06.end;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesExercise {

    public static void main(String[] args) {
        try {
            // Create a new empty file called example.txt inside folderA
            Path path = Paths.get("src/main/java/_07_06/folderA/example.txt");
            if(Files.notExists(path)) {
                Files.createFile(path);
            }

            // Copy the file to folderB
            Path newPath = Paths.get("src/main/java/_07_06/folderB/example.txt");
            if(Files.notExists(newPath)) {
                Files.copy(path, newPath);
            }

            // List the contents of folderB to check that your file is in there
            Files.list(Paths.get("src/main/java/_07_06/folderB"));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
