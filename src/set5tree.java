import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class set5tree {
        public static void main(String[] args) {
            Set<Integer> set = new TreeSet<>();
            set.add(7);
            set.add(0);
            set.add(9);
            set.add(2);
            set.add(41);
            set.add(3);
            System.out.println(set);

            set.remove(5);
            System.out.println(set);
        }
    }


