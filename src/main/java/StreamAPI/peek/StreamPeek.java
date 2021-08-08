package StreamAPI.peek;

import java.util.Arrays;

public class StreamPeek {
    public static void main(String[] args) {
        Integer[] array = {1,2,3,4,5,1,2,3};
        System.out.println("Result 1: " + Arrays.stream(array).distinct().peek(System.out::println).count());
    }
}
