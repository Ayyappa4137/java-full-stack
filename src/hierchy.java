interface vehicle
{
    void show(String vehiclenum,String vcolor);
    void show1(String vsound);
}
interface car12 extends vehicle
{
    void show2(String carname,String color,String price);
    void show3(String carsound);
}

interface bike extends vehicle
{
    void show4(String name,String price,String enginum);
    void show5(String bikesound);
}
class Ayyu implements car12,bike
{
    public void show(String vehiclenum,String vcolor)
    {
        {
            System.out.println(vehiclenum+" "+vcolor);
        }
    }
    public void show1(String vsound)

    {
        System.out.println(vsound);
    }
    public void show2(String carname,String color,String price)
    {
        {
            System.out.println(carname+" "+color+" "+price);
        }
    }
    public void show3(String carsound)
    {
        System.out.println(carsound);
    }

    public void show4(String name,String price,String enginum)
    {
        System.out.println(name+" "+price+" "+enginum);
    }
    public void show5(String bikesound)
    {
        System.out.println(bikesound);
    }
}

public class hierchy {

    public static void main(String[] args)
    {
        Ayyu obj=new Ayyu();
        obj.show("java01","black");
        obj.show1("big");
        obj.show2("jimmy","black","1500000");
        obj.show3("silent");
        obj.show4("java","125000","javaengi5789");
        obj.show5("silent");


    }
}


























