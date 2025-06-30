
import java.util.List;
import java.util.Vector;

public class linkedlist5 {
    public static void main(String[] args) {
        List<String> LL = new Vector<>();

        LL.add("Psych");
        LL.add("boss ");
        LL.add("boss ");

        LL.add("M boss ");
        System.out.println(LL);
        LL.add(1, "D Boss");
        System.out.println(LL);
        System.out.println(LL.size());
        System.out.println(LL.get(3));
        System.out.println(LL);
        LL.remove(2);
        System.out.println(LL);
        System.out.println(LL.contains("chilly"));
    }
}
