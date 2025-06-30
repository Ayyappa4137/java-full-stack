/*import java.util.LinkedList;
import java.util.Queue;

public class queuereverse {
    public static void main(String[] args) {
        Queue<String>qq=new LinkedList<>();
        qq.add("M");
        qq.add("A");
        qq.add("R");
        qq.add("Y");
        qq.add("P");
        System.out.println(qq);
       int size=qq.size();
       String qq1=new String();
       for(int i=0;i<size;i++){
           qq1=qq.remove();

       }
       for(int i=size-1;i>=0;i--)
           qq.add(qq1[i]);
        System.out.println(qq);
    }
}
*/
import java.util.LinkedList;
import java.util.Queue;

public class queuereverse {
    public static void main(String[] args) {
        Queue<String> qq = new LinkedList<>();
        qq.add("M");
        qq.add("A");
        qq.add("R");
        qq.add("Y");
        qq.add("P");

        System.out.println("Original Queue: " + qq);

        // Step 1: Copy elements into an array
        int size = qq.size();
        String[] temp = new String[size];

        for (int i = 0; i < size; i++) {
            temp[i] = qq.remove();  // remove from queue and store
        }

        // Step 2: Add elements back in reverse order
        for (int i = size - 1; i >= 0; i--) {
            qq.add(temp[i]);       // add back to queue
        }

        System.out.println("Reversed Queue: " + qq);
    }
}
