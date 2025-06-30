class pqrs
{
  private   String name="ajay";

   private void details()
    {
        System.out.println(name);
    }
    void details1()
    {
        details();
    }

}
public class accessmod1 {
    public static void main(String [] args)
    {
        pqrs obj=new pqrs();
        obj.details1();
    }
}
