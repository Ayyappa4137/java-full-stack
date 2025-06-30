interface A  //parent
{
    void add();
}
interface B   //parent
{
    void sub();
}
class C implements A,B  //child
{
   public void add()
   {
       System.out.println("parent1");
   }
   public void sub()
   {
       System.out.println("parent2");
   }

}
public class MULTIPLES {
    public static void main(String[] args)
    {
        C obj=new C();
        obj.add();
        obj.sub();

    }
}
