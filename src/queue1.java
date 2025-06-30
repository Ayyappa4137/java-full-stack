import java.util.LinkedList;
import java.util.Queue;

public class queue1 {
    public static void main(String[] args) {
        Queue<String>queue=new LinkedList<>();
        queue.offer("ajay");
        queue.offer("vishwa");
        queue.offer("Raghu");
        queue.offer("Arun");
        System.out.println(queue);
        queue.peek();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        System.out.println(queue.peek());//



    }
    }

