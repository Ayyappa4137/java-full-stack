import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class mapreduce1 {
    public static void main(String[] args) {
        List<Integer> n1 = Arrays.asList(1, 2, 3, 4, 5);
           /* BinaryOperator<Integer> b = new BinaryOperator<Integer>() {
                @Override
                public Integer apply(Integer i, Integer j) {
                    return i*j;
                }

            };*/
          Integer sum=  n1.stream().filter(i -> i % 2 == 0)
                    .map(i->i*2)
                    .reduce(0,(i,j)->i+j);

                  //  .forEach(System.out::println);
        System.out.println(sum);
        }
    }
