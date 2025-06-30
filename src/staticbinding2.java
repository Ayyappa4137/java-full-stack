class A4567
{
     static class B
     {
        void demo( int a,int b)
         {
            System.out.println("Addition:"+(a+b));
            System.out.println("substraction:"+(a-b));
            System.out.println("multiplication:"+(a*b));
            System.out.println("Division:"+(a/b));
             System.out.println("Mod:"+(a%b));

        }
    }
}
public class staticbinding2 {

    public static void main(String[] args)
    {
        A4567.B obj=new A4567.B();
        obj.demo(15,10);
    }
}





