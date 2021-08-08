package StreamAPI.reduce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduce {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 6, 11, 23, 41);
        int a = list.stream().reduce((accum, element) -> accum * element).get();
        System.out.println("result 1: " + a);

        List<Integer> list2 = new ArrayList<>();
        Optional<Integer> optional = list2.stream().reduce((accum, element) -> accum * element);
        if(optional.isPresent()) System.out.println("result 2: " + optional);
        else System.out.println("result 2: Not present");

        List<Integer> list3 = Arrays.asList(2, 4, 6, 11, 23, 41);
        int result3 = list.stream().reduce(2,(accum, element) -> accum * element);
        System.out.println("result 3: " + result3);

        List<String> list4 = Arrays.asList("Intro", "Test", "example");
        String result4 = list4.stream().reduce((ac, el) -> ac + " " + el).get();
        System.out.println("Result 4: " + result4);

     }
}
