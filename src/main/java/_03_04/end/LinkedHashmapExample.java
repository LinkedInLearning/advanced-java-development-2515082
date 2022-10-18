package _03_04.end;

import java.util.LinkedHashMap;

public class LinkedHashmapExample {

    public static void main(String[] args) {
        LinkedHashMap<String, Integer> basket = new LinkedHashMap<>(10, 0.75f, true);

        basket.put("apple", 2);
        basket.put("orange", 1);
        basket.put("banana", 3);

        basket.get("apple");

        basket.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
