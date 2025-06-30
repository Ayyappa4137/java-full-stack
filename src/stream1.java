

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class stream1 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list);
        Stream s1 = list.stream();
        s1.forEach(System.out::println);
        s1.forEach(System.out::println);

    }
}
