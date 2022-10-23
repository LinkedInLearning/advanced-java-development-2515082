package _06_06.end;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FileReaderExerciseTest {

    FileReaderExercise fileReaderExercise = new FileReaderExercise();

    @Test
    public void testGetFirstLine() {
        String expected = "Scanners and BufferedReaders can perform similar operations in Java.";
        String actual = fileReaderExercise.getFirstLine();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetWholeFile() {
        String expected = "Scanners and BufferedReaders can perform similar operations in Java. " +
                "For example both can be used to read input from the terminal, or read input from a file. " +
                "However they work slightly differently. " +
                "The Scanner class parses tokens from the stream, whereas BufferedReader just reads the input line by line. " +
                "This means that it is slightly faster to read input using a BufferedReader, as it doesn't parse the content. " +
                "But Scanner is better if you do want to parse the content. For example you can split text into sentences rather than into lines, if you use the Scanner to separate text at each period. " +
                "Another difference is that BufferedReader is thread-safe, whereas Scanner is not. ";
        String actual = fileReaderExercise.getWholeFile();
        assertEquals(expected, actual);
    }

}