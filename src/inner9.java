class outer777
{
private String name="Ayyappa";
private String course="Java";

class inner1
    {
     void display()

     {
        System.out.println(name+"\n"+course);

     }

    }

  }

public class inner9{

    public static void main(String[] args) {

        outer777 obj1 = new outer777();

        outer777.inner1 obj2 = obj1.new inner1();
        obj2.display();
    }
}
