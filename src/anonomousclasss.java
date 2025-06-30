abstract class A45
{
    public abstract void show();

}
public class anonomousclasss {
    public static void main(String[] args)
    {
        A45 obj= new A45()
        {
            public void show()
            {
                System.out.println("Anonomous clss");
            }
        };
        obj.show();
    }
}
