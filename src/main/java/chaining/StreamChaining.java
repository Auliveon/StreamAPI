package chaining;



import java.util.Arrays;
import java.util.List;

public class StreamChaining {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};
        int result = Arrays.stream(array).filter(e -> e % 2 == 1).map(e -> {
            if (e % 3 == 0) {
                e = e / 3;
            }
            return e;
        }).reduce((ac, e) -> ac + e).getAsInt();
        System.out.println("Result 1: " + result);

        List<Student> students = Arrays.asList(new Student("Kirill", 23, "m"), new Student("Svetlana", 41, "f"),
                new Student("Katya", 19, "f"), new Student("Ivan", 25, "m"), new Student("Alex", 22, "m"));
        students.stream().map(e -> {e.setName(e.getName().toUpperCase()); return e;}).filter(e -> e.getSex().equals("f")).sorted((x, y) -> x.getAge() - y.getAge())
                .forEach(e -> System.out.println(e));


    }
}
