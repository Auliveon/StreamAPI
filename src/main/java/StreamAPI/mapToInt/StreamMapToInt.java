package StreamAPI.mapToInt;

import StreamAPI.minAndMax.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapToInt {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("Kirill", 23, "m"), new Student("Svetlana", 41, "f"),
                new Student("Katya", 19, "f"), new Student("Ivan", 25, "m"), new Student("Alex", 22, "m"));

        List<Integer> list = students.stream().mapToInt(e -> e.getAge()).boxed().collect(Collectors.toList());
        System.out.println(list);

        int sum = students.stream().mapToInt(e -> e.getAge()).sum();
        Double average = students.stream().mapToInt(e -> e.getAge()).average().getAsDouble();
        int min = students.stream().mapToInt(e -> e.getAge()).min().getAsInt();
        int max = students.stream().mapToInt(e -> e.getAge()).max().getAsInt();
        System.out.println("sum: " + sum + '\n' +
                "average: " + average + '\n' +
                "min: " + min + '\n' +
                "max: " + max + '\n');

    }
}
