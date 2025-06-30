import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityqueu1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        queue.offer(25);
        queue.offer(36);
        queue.offer(49);
        queue.offer(64);
        queue.add(81);
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        queue.add(10);
        queue.add(15);
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        System.out.println(queue.peek());


    }
}

