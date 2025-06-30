class outer45
{
    private int a=10;
    class inner
    {
        public int getvalue()
        {
            return a;
        }
    }

}
public class inner5 {
    public static void main(String[] args)
    {
        outer45 obj1=new outer45();
        outer45.inner obj2=obj1.new inner();
        System.out.println(obj2.getvalue());
    }
}
