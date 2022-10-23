package _06_06.end;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExercise {

    String getFirstLine() {
        String firstLine = "";
        try(BufferedReader reader = new BufferedReader(new FileReader("src/main/java/_06_06/BufferedReaderVsScanner.txt"))) {
            firstLine = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return firstLine;
    }

    String getWholeFile() {
        String wholeFile = "";
        try(BufferedReader reader = new BufferedReader(new FileReader("src/main/java/_06_06/BufferedReaderVsScanner.txt"))) {
            StringBuilder stringBuilder = new StringBuilder();
            reader.lines().forEach(line -> stringBuilder.append(line + " "));
            wholeFile = stringBuilder.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wholeFile;
    }

}
