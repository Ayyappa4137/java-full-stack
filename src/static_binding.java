class A456{
    static class B
    {
        void demo()
        {
            System.out.println("static class");
        }
    }
}
public class static_binding {
public static void main(String[] args)
    {
        A456.B obj=new A456.B();
        obj.demo();
    }
}
