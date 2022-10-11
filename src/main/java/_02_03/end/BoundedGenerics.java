package _02_03.end;

import java.util.*;

public class BoundedGenerics {

    public static void main(String[] args) {
        Double[] doubles = {2.0, 3.5, 14.7};
        Integer[] numbers = {1, 5, 7};
        List<Double> doublesList = convertArrayToList(doubles);
        List<Integer> numbersList = convertArrayToList(numbers);
        System.out.println(doublesList);
        System.out.println(numbersList);
    }

    private static <T extends Number> List<T> convertArrayToList(T[] array) {
        return Arrays.asList(array);
    }


}
