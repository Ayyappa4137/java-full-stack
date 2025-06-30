import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class filter1 {
    public static void main(String[] args) {

        List<Integer> n1 = Arrays.asList(1, 2, 3, 4, 5);
       // System.out.println(n1);
        //Predicate<Integer> pred = new Predicate<Integer>() {
          //  @Override
            //public boolean test(Integer i) {
              //  return i % 2 == 0;
        //    }
      //  };
       // n1.stream().filter(pred).forEach(System.out::println);



         System.out.println(n1);
         n1.stream()
         .filter(i->i%2==0)
         .forEach(System.out::println);


    }
}
