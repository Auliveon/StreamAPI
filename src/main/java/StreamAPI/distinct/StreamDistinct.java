package StreamAPI.distinct;

import java.util.Arrays;

public class StreamDistinct {
    public static void main(String[] args) {
        Integer[] array = {1,2,3,4,5, 1, 2, 3};
        Arrays.stream(array).distinct().forEach(System.out::println);

    }
}
