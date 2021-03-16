package concat;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamConcat {
    public static void main(String[] args) {
        Integer[] array = {1,2,3,4,5};
        Integer[] array2 = {6,7,8,9,10};
        Stream<Integer> stream = Stream.concat(Arrays.stream(array), Arrays.stream(array2));
        stream.forEach(System.out::print);
    }
}
