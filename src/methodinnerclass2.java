class AA22
{
    void show()
    {
        class B33
        {
            void display(String Pname,double age)
            {
                System.out.println(Pname+"\n"+age);
            }

            void display2(String dogname,String Dcolor)
            {
                {
                    System.out.println(dogname+"\n"+Dcolor);
                }
            }
        }



        B33 obj1=new B33();
        obj1.display("Ayyappa",24);
        obj1.display2("GS","Black");
    }
}

public class methodinnerclass2{
    public static void main(String[] args)
    {
        AA22 obj=new AA22();
        obj.show();
    }
}












