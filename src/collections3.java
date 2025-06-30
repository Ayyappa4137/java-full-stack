import java.util.ArrayList;
import java.util.List;


public class collections3 {
        public static void main(String[] args) {
            List<String> list=new ArrayList<>();

            list.add("mango");
            list.add("apple ");
            list.add("grapes");
            System.out.println(list);
            list.add(1,"banana");
            System.out.println(list);
            System.out.println(list.size());
            System.out.println(list.get(3));
            System.out.println(list);
            list.remove(2);
            System.out.println(list);
            System.out.println(list.contains("chilly"));
        }
    }


