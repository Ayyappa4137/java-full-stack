class outer1
{
    private class inner
    {

        void demo99(String name,int age)
        {
            System.out.println(name+"\n"+age);
        }
    }
    void display()
    {
        inner obj2=new inner();
        obj2.demo99("Vishwa",24);
    }
}
public class inner2 {
    public static void main(String[] args)
    {
        outer1 obj1=new outer1();
        obj1.display();
    }
}






