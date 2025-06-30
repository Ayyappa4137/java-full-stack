interface dog01
{
    void show(String name,String breed,String color);
}
interface cat
{
    void show2(String name,String color);
}
class cad implements dog01,cat
{
    public void show(String name,String breed,String color)
    {
        System.out.println(name+" "+breed+" "+color);
    }
    public void show2(String name,String color)
    {
        System.out.println(name+" "+color);
    }

}

public class multip2 {
    public static void main(String[] args)
    {
       cad obj=new cad();
       obj.show("buddy","GS","black");
       obj.show2("jimmy","black");

    }
}



















