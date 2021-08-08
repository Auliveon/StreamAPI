package StreamAPI.parallelStream;

import java.util.Arrays;
import java.util.List;

public class StreamParalelStream {
    public static void main(String[] args) {
        List<Double> list = Arrays.asList(10.0, 5.0, 1.0, 0.25);
        double result = list.parallelStream().reduce((a, e) -> a/e).get();
        System.out.println(result);
    }
}
