abstract class sbd1
{
    public abstract void dog1(String Dname1,String DColor1);
    public abstract void cat1(String Cname,String CColor);

}

public class anonomousclass2 {
    public static void main(String[] args)
    {
        sbd1 obj= new sbd1()
        {
            public void dog1(String Dname1,String DColor1)
            {
                System.out.println(Dname1+"\n"+DColor1);
            }
            public void cat1(String Cname,String CColor)
            {
                System.out.println(Cname+"\n"+CColor);
            }
        };
        obj.dog1("GS","black");
        obj.cat1("buddy","white");

    }
}














