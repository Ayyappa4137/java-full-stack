class outer77
{
    private  String name;
    private  String age;
     private class inner1
     {
         void display(String  name,String course)
         {
             System.out.println(name+"\n"+course);
         }
     }
     void display()
     {
         inner1 obj=new inner1();
         obj.display("Ayyappa","Java");
     }
}
public class inner7 {
    public static void main(String[] args)
    {
        outer77 obj1=new outer77();
        obj1.display();
    }
}
