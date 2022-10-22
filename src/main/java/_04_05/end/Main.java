package _04_05.end;

import java.util.*;
import java.util.stream.Collectors;

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

    static List<String> processWithStreams(List<String> fruit) {
        return fruit.stream()
                .map(String::toUpperCase)
                .filter(item -> item.startsWith("P"))
                .sorted()
                .collect(Collectors.toList());
    }

}
