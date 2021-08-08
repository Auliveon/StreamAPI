package StreamAPI.findFirst;



import java.util.Arrays;
import java.util.List;

public class StreamFindFirst {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("Kirill", 23, "m"), new Student("Svetlana", 41, "f"),
                new Student("Katya", 19, "f"), new Student("Ivan", 25, "m"), new Student("Alex", 22, "m"));

        Student st = students.stream().filter(e -> e.getSex().equals("f")).findFirst().get();
        System.out.println(st.toString());
    }
}
