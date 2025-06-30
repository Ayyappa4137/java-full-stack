class outer457
{
    private String name="ayyappa";
    class inner
    {
        public void getname()
        {
            System.out.println(name);
        }
    }
}
public class inner6 {

    public static void main(String[] args)
    {
        outer457 obj1=new outer457();
        outer457.inner obj2=obj1.new inner();
        obj2.getname();
    }
}




