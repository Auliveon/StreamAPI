package StreamAPI.minAndMax;



import java.util.Arrays;
import java.util.List;

public class StreamMinAndMax {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("Kirill", 23, "m"), new Student("Svetlana", 41, "f"),
                new Student("Katya", 19, "f"), new Student("Ivan", 25, "m"), new Student("Alex", 22, "m"));

        Student st = students.stream().min((s1, s2) -> s1.getAge() - s2.getAge()).get();
        System.out.println("Min: " + st);

        Student st2 = students.stream().max((s1, s2) -> s1.getAge() - s2.getAge()).get();
        System.out.println("Max: " + st);
    }
}
