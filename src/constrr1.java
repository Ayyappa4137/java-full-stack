class employee5
{
    String name;
    double salary1;
    String depart_name;

    employee5(String a,String b,double c)
    {
        name=a;
        depart_name=b;
        salary1=c;
    }
    public void details()
    {
        System.out.println(name+"  "+depart_name+" "+salary1);

    }
}
public class constrr1 {
    public static void main(String[] args)
    {
        employee5 obj=new employee5("AYYAPPA","software developer",55000);
        obj.details();
    }
}
