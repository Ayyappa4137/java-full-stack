interface AAA1
{

   // default void demo()
   static void demo()

   {
        System.out.println("demo");
    }

}
class demo1 implements AAA1
{

}

public class interface11 {
    public static void main(String[] args) {


        AAA1 obj=new demo1();
        AAA1.demo();
    }
}


