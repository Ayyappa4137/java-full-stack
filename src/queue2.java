import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Vector;

public class queue2 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(25);
        queue.offer(36);
        queue.offer(49);
        queue.offer(64);
        System.out.println(queue);
        queue.peek();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        queue.offer(100);
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.add(81);
        System.out.println(queue);
        queue.add(121);
        System.out.println(queue);
        System.out.println(queue.contains(55));
        System.out.println(queue.size());
        queue.clear();
        System.out.println(queue);
    }
}
