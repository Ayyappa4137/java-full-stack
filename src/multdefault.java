interface A11 {

   static void show() {
        System.out.println("static parent");
    }

    default void display() {
        System.out.println("default parent");
    }
}
class demo33 implements A11 {

    public void display()
        {
            System.out.println("default parent");
        }

    }
public class multdefault
{
    public static void main(String[] args_)
    {
        A11.show();
        demo33 obj1=new demo33();
        obj1.display();
    }
}
