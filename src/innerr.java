class outer
{
    private class inner
    {
        void demo99()
        {
            System.out.println("inner private class");
        }
    }
    void display()
    {
        inner obj2=new inner();
        obj2.demo99();
    }
}
public class innerr {
    public static void main(String[] args)
    {
        outer obj1=new outer();
        obj1.display();
    }
}
