package _07_04.end;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCopier {

    public static void main(String[] args) {

        Path pathToFile = Paths.get("src/main/java/_07_04/files/a/example.txt");
        Path pathToNewLocation = Paths.get("src/main/java/_07_04/files/b/example.txt");
        try {
            if(Files.notExists(pathToNewLocation)) {
                Files.copy(pathToFile, pathToNewLocation);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
