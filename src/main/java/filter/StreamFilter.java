package filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        list.add(new Book("Book1", 500, 3000));
        list.add(new Book("Book2", 320, 4000));
        list.add(new Book("Book3", 777, 1100));

        List<Book> list2 = list.stream().filter(element -> element.getPrice() > 2500 && element.getCount() > 400).collect(Collectors.toList());
        System.out.println(list2.toString());
    }

}
