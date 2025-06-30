class parent
{
    public void A()
    {
        System.out.println("parent features");
    }
}
class child extends parent
{
    public void A()
    {
        System.out.println("parent features");
    }

    public void B()
    {
        System.out.println("child featureps");
    }
}

public class singleinherit {
    public static void main(String[] args) {
        child obj = new child();
        obj.A();
        obj.B();

    }
}

