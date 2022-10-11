package _02_03.before;

import java.util.Arrays;
import java.util.List;

public class BoundedGenerics {

    public static void main(String[] args) {
        String[] words = {"apple", "banana", "pear"};
        Integer[] numbers = {1, 5, 7};
        List<String> wordsList = convertArrayToList(words);
        List<Integer> numbersList = convertArrayToList(numbers);
        System.out.println(wordsList);
        System.out.println(numbersList);
    }

    private static <T> List<T> convertArrayToList(T[] array) {
        return Arrays.asList(array);
    }


}