class A22
{
    void show()
    {
        class B33
        {
            void display()
            {
                System.out.println("method local inner class ");
            }
        }
            B33 obj1=new B33();
            obj1.display();
    }
}

public class methodlocalinner {
    public static void main(String[] args)
    {
        A22 obj=new A22();
        obj.show();
    }
}
