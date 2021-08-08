package StreamAPI.map;

import java.util.*;
import java.util.stream.Collectors;

public class StreamMap {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Intro");
        list.add("Test");
        list.add("example");
        List<Integer> list2 =  list.stream().map(element -> element.length()).collect(Collectors.toList());
        System.out.println("Example 1: " +list2.toString());

        int[] array = {9, 31, 71, 32, 99, 1};
        array =Arrays.stream(array).map(element
                -> {
            if(element%3 == 0) {
                element = element / 3;
            }
            return element;
            }
        ).toArray();
        System.out.println("Example 2: " + Arrays.toString(array));

        Set<String> set = new TreeSet<>();
        set.add("Cat");
        set.add("Dog");
        set.add("Bee");
        List<String> list3 = set.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("Example 2: " + list3.toString());

    }

}
