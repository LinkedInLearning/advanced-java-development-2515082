package _04_07.end;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StreamUtilsTest {

    StreamUtils streamUtils = new StreamUtils();
    private List<String> weekdays = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday");

    @Test
    public void testSorted() {
        List<String> actual = streamUtils.sorted(weekdays);

        List<String> expected = Arrays.asList("Friday", "Monday", "Thursday", "Tuesday", "Wednesday");

        assertEquals(expected, actual);
    }


    @Test
    public void testBeginningWithT() {
        List<String> actual = streamUtils.beginningWithT(weekdays);

        List<String> expected = Arrays.asList("Tuesday", "Thursday");

        assertEquals(expected, actual);
    }

    @Test
    public void testUpperCase() {
        List<String> actual = streamUtils.upperCase(weekdays);

        List<String> expected = Arrays.asList("MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY");

        assertEquals(expected, actual);
    }

    @Test
    public void testEverythingCombined() {
        List<String> actual = streamUtils.everythingCombined(weekdays);

        List<String> expected = Arrays.asList("THURSDAY", "TUESDAY");

        assertEquals(expected, actual);
    }


}