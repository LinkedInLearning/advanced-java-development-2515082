package _07_02.end;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCreationExample {

    public static void main(String[] args) {

        Path path = Paths.get("src/main/java/_07_02/example.txt");
        try {
            if(Files.notExists(path)) {
                Files.createFile(path);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
