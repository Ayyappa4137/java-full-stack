import java.util.ArrayList;
import java.util.List;


public class collection2 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.add(1,40);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(3));
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.println(list.contains(80));
    }
}
