import org.w3c.dom.ls.LSOutput;

interface AAA {


    static void demo() {
        System.out.println("demo");
    }

    interface BBB {
        default void demo() {
            System.out.println("demo2");
        }
    }
}
 class Ccc implements AAA1{

     public void demo() {
         System.out.println("demo3");
     }
     }

    public class interandclass extends demo1 implements AAA.BBB {
        public static void main(String[] args) {

            AAA1 obj = new demo1();
            AAA1.demo();
        }
    }
















