import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class dqueue1 {
    public static void main(String[] args) {
        ArrayDeque<Integer> dqueue = new ArrayDeque<>();
        dqueue.offer(95);
        dqueue.offer(36);
        dqueue.offer(49);
        dqueue.offer(64);
        dqueue.add(15);
        dqueue.add(81);
        System.out.println(dqueue);
        System.out.println(dqueue.peek());
        dqueue.poll();
        System.out.println(dqueue);
        dqueue.remove();
        System.out.println(dqueue);
        dqueue.offerFirst(10);
        dqueue.offerLast(150);
        System.out.println(dqueue);
        dqueue.removeLast();
        System.out.println(dqueue);
        dqueue.removeFirst();
        System.out.println(dqueue);
        dqueue.pollFirst();
        dqueue.pollLast();
        System.out.println(dqueue);
        dqueue.addFirst(15);
        dqueue.addFirst(25);
        System.out.println(dqueue);
        System.out.println(dqueue.size());
        System.out.println(dqueue.getFirst());
        System.out.println(dqueue.getLast());
        dqueue.clear();
        System.out.println(dqueue);

    }
}
