package _04_05.before;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> fruit = Arrays.asList("apple", "pineapple", "banana", "pear", "strawberry");
        List<String> capitalisedFruit = processWithoutStreams(fruit);
        System.out.println(capitalisedFruit);
    }

    static List<String> processWithoutStreams(List<String> fruit) {
        List<String> capitalisedFruit = new ArrayList<>();
        for (String item : fruit) {
            item = item.toUpperCase();
            if(item.startsWith("P"))
            {
                capitalisedFruit.add(item);
            }
        }
        Collections.sort(capitalisedFruit);
        return capitalisedFruit;
    }

}
