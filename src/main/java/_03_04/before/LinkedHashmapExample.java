package _03_04.before;

import java.util.HashMap;

public class LinkedHashmapExample {

    public static void main(String[] args) {
        HashMap<String, Integer> basket = new HashMap<>();

        basket.put("apple", 2);
        basket.put("orange", 1);
        basket.put("banana", 3);

        basket.forEach((key, value) -> System.out.println(key + ": " + value));

    }
}
