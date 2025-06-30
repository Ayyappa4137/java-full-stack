import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class mapfunction {
    public static void main(String[] args) {

        List<Integer> n1 = Arrays.asList(1, 2, 3, 4, 5);
        Function<Integer,Integer>f=new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer i) {
                return i*2;
            }
        };
        n1.stream().filter(i->i%2==0).map(f).forEach(System.out::println);
    }
}
