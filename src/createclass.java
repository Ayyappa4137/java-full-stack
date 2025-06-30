class person1
{
    String name="Guru";
    int age=18;
}
public class createclass {
    public static void main(String[] args)
    {
        person1 obj=new person1();
        person1 obj1=new person1();
        System.out.println("person name= "+obj.name);
        System.out.println("person name= "+obj.age);
        System.out.println("person name= "+obj1.name);
        System.out.println("person name= "+obj1.age);
    }

}
