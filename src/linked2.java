import java.util.LinkedList;
import java.util.List;

public class linked2 {
        public static void main(String[] args) {
            List<Integer> LL=new LinkedList<>();

            LL.add(7);
            LL.add(1);
            LL.add(90);
            LL.add(22);
            LL.add(41);
            System.out.println(LL);
            LL.add(1,0);
            System.out.println(LL);
            System.out.println(LL.size());
            System.out.println(LL.get(3));
            System.out.println(LL);
            LL.remove(2);
            LL.add(5,37);
            System.out.println( LL);
            System.out.println(LL.contains(55));
            LL.clear();
            System.out.println( LL);

        }
    }

