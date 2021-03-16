package sorted;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSorted {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 5, 7, 18, 2};
        array = Arrays.stream(array).sorted().toArray();
        System.out.println("Result 1: " + Arrays.toString(array));

        List<Student> students = Arrays.asList(new Student("Kirill", 23), new Student("Artyom", 41),
                new Student("Oleg", 19), new Student("Ivan", 25), new Student("Alex", 22));
        students = students.stream().sorted((student1, student2) ->
                student1.getName().compareTo(student2.getName())).collect(Collectors.toList());
        System.out.println("Result 2: " + students);


    }
}
