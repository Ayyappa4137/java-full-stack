import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class stream2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(19, 12, 32, 18, 19, 25, 6);
        //list.stream().sorted().forEach(System.out::println);
        //list.stream().unordered().forEach(System.out::println);
       // list.stream().distinct().forEach(System.out::println);
        //list.stream().skip(3).forEach(System.out::println);
        list.stream().limit(5).forEach(System.out::println);

    }
}
