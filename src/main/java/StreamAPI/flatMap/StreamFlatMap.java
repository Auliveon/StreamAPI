package StreamAPI.flatMap;



import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMap {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("Kirill", 23, "m"), new Student("Svetlana", 41, "f"),
                new Student("Katya", 19, "f"), new Student("Ivan", 25, "m"), new Student("Alex", 22, "m"));
        List<Student> students2 = Arrays.asList(new Student("Kirill2", 23, "m"), new Student("Svetlana2", 41, "f"),
                new Student("Katya2", 19, "f"), new Student("Ivan2", 25, "m"), new Student("Alex2", 22, "m"));
        Faculty f1 = new Faculty("Economy", students);
        Faculty f2 = new Faculty("Math", students2);
        List<Faculty> faculties = Arrays.asList(f1, f2);
        List<Student> students1 = faculties.stream().flatMap(faculty -> faculty.getStudents().stream()).collect(Collectors.toList());
        System.out.println(students1);




    }
}
