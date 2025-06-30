//import org.w3c.dom.ls.LSOutput;

class abc1
{
    public static int add(int a,int b)
    {
        return a+b;
    }
    public static int add(int a,int b,int c)
    {
        return a+b+c;
    }
}
public class staticbi {
    public static void main(String[] args)
    {
        System.out.println(abc1.add(1,5,6));
        System.out.println(abc1.add(5,2));
    }
}
