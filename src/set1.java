import java.util.HashSet;
import java.util.Set;

public class set1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("abc");
        set.add("hgf");
        set.add("gty");
        set.add("mmm");
        set.add("hjhjgj");
        System.out.println(set);
        System.out.println(set.remove("gty"));
        set.remove("mmm");
        System.out.println(set);
    }
}
