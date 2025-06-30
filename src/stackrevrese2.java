/*import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class stackrevrese2 {
        public static void main(String[] args) {
            Stack<String>QQ=new Stack<>();
            Queue<String>QQ1=new LinkedList<>();
           QQ.add("V");
            QQ.add("I");
            QQ.add("S");
            QQ.add("W");
            QQ.add("A");
            System.out.println(QQ);
            while (!QQ.isEmpty())
            {
                QQ1.offer(QQ.pop());
            }
            while(!QQ1.isEmpty())
            {
                QQ1.push(QQ.poll());
            }
            System.out.println(QQ1);
        }
    }*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class StackReverse {
    public static void main(String[] args) {
        Stack<String> QQ = new Stack<>();
        Queue<String> QQ1 = new LinkedList<>();

        QQ.push("M");
        QQ.push("A");
        QQ.push("R");
        QQ.push("y");
        QQ.push("P");

        System.out.println("Original Stack: " + QQ);

        // Step 1: Pop all from stack to queue
        while (!QQ.isEmpty()) {
            QQ1.offer(QQ.pop());
        }

        // Step 2: Add back from queue to stack
        while (!QQ1.isEmpty()) {
            QQ.push(QQ1.poll());
        }

        System.out.println("Reversed Stack: " + QQ);
    }
}
