class person
{
    String name="Guru";
    int age=18;
    String address="bangalore";
}
class dog
{
    String name="Munna";
    String breed="GS";
    String color="brown";
}
public class createclass1 {
    public static void main(String[] args)
    {
        person obj=new person();
        System.out.println("person name= "+obj.name);
        System.out.println("person name= "+obj.age);
        System.out.println("person address= "+obj.address);


        dog obj1=new dog();
        System.out.println("dog name= "+obj1.name);
        System.out.println("dog color= "+obj1.color);
        System.out.println("dog breed= "+obj1.breed);
    }

}




