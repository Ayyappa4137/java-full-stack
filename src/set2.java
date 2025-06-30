import java.util.HashSet;
import java.util.Set;

public class set2 {
        public static void main(String[] args) {
            Set<Integer> set = new HashSet<>();
            set.add(5);
            set.add(12);
            set.add(22);
            set.add(2);
            set.add(5);
            System.out.println(set);

            set.remove(5);
            System.out.println(set);
        }
    }

