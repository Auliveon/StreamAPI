package StreamAPI.skip;

import StreamAPI.minAndMax.Student;

import java.util.Arrays;
import java.util.List;

public class StreamSkip {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("Kirill", 23, "m"), new Student("Svetlana", 41, "f"),
                new Student("Katya", 19, "f"), new Student("Ivan", 25, "m"), new Student("Alex", 22, "m"));
        students.stream().filter(e->e.getAge() > 23).forEach(System.out::println);
        System.out.println("--------------------------------------");
        students.stream().filter(e->e.getAge() > 23).limit(2).forEach(System.out::println);
        System.out.println("--------------------------------------");
        students.stream().filter(e->e.getAge() > 23).skip(1).forEach(System.out::println);
    }
}
