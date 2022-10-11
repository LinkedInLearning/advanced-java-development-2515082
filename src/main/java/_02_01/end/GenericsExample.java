package _02_01.end;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

    public static void main(String[] args) {

        List<String > shapes = new ArrayList<>();
        shapes.add("Circle");
        System.out.println(shapes.get(0));
        String circle = shapes.get(0);
        shapes.add("Rectangle");
        String rectangle = shapes.get(1);



    }

}
