package forEach;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamForEach {
    public static void main(String[] args) {
        int[] array = {3, 5, 2, 1, 5, 8, 0};

        Arrays.stream(array).forEach(element -> {element *= 2;
            System.out.print(element + " ");});

        System.out.println();

        Arrays.stream(array).forEach(Utils::myUtil);

        Stream<Integer> str = Stream.of(3, 7, 3, 6, 4, 7);
        str.forEach(Utils::myUtil);

    }
}


