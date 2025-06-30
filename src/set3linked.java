import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class set3linked {
        public static void main(String[] args) {
            Set<String> set = new LinkedHashSet<>();
            set.add("tiger");
            set.add("cat");
            set.add("dog");
            set.add("cow");
            set.add("crow");
            System.out.println(set);
            System.out.println(set.remove("gty"));
            set.remove("crow");
            System.out.println(set);
        }
    }

