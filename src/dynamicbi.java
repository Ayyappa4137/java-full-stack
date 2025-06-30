class A12
{
    public void display01()
    {
        System.out.println("parent");
    }
}
class B12 extends A12
{

}


public class dynamicbi {
public static void main(String[] args)
{
    A12 obj=new B12();
    obj.display01();


}
}


