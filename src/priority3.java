import java.util.PriorityQueue;

public class priority3 {
    public static void main(String[] args) {
        PriorityQueue<String>QQ=new PriorityQueue<>();
        QQ.offer("Ram");
        QQ.offer("abhi");
        QQ.offer("Vijay");
        QQ.offer("AA MARY");
        System.out.println(QQ);
        while (!QQ.isEmpty())
        {
            System.out.println(QQ.poll());
        }
    }
}
