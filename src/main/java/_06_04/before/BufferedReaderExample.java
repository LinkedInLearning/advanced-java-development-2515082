package _06_04.before;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/main/java/_06_03/example.txt"));
            System.out.println("First line:");
            String firstLine = reader.readLine();
            System.out.println(firstLine);
            System.out.println("Every other line:");
            StringBuilder stringBuilder = new StringBuilder();
            reader.lines().forEach(stringBuilder::append);
            System.out.println(stringBuilder);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}