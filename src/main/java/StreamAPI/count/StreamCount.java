package StreamAPI.count;

import java.util.Arrays;

public class StreamCount {
    public static void main(String[] args) {
        Integer[] array = {1,2,3,4,5,1,2,3};
        System.out.println("Result 1: " + Arrays.stream(array).count());
        System.out.println("Result 2: " + Arrays.stream(array).distinct().count());

    }
}
