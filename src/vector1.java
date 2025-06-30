import java.util.List;
import java.util.Vector;


class vectorslist1 {
        public static void main(String[] args) {
            List<String> LL=new Vector<>();

            LL.add("AG");
            LL.add("22");
            LL.add("MC");
            LL.add("00");
            LL.add("7");
            System.out.println(LL);
            LL.add(1,"0");
            System.out.println(LL);
            System.out.println(LL.size());
            System.out.println(LL.get(3));
            System.out.println(LL);
            LL.remove(2);
            LL.add(5,"37");
            System.out.println( LL);
            System.out.println(LL.contains("55"));
            LL.clear();
            System.out.println( LL);

        }
    }

