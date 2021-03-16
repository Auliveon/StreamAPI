package groupingAndPartitioning;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGroupingAndPartitioning {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(new Student("Kirill", 23, "m"), new Student("Svetlana", 41, "f"),
                new Student("Katya", 19, "f"), new Student("Ivan", 25, "m"), new Student("Alex", 22, "m"));

        Map<String, List<Student>> map = students.stream().map(e -> {
            e.setName(e.getName().toUpperCase());
            return e;
        }).collect(Collectors.groupingBy(e -> e.getSex()));
        for (Map.Entry mapentry : map.entrySet()) {
            System.out.println(mapentry.getKey() + " " + mapentry.getValue());
        }



        Map<Boolean, List<Student>> map2 = students.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 30));
        for (Map.Entry mapentry : map2.entrySet()) {
            System.out.println(mapentry.getKey() + " " + mapentry.getValue());
        }
    }
}
