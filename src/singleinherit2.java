class car1 {
    String color;
    String model;

    car1(String color, String model) {
        this.color = color;
        this.model = model;
    }

    void cardetails() {
        System.out.println(color + " " + model);
    }
}
class bmw extends car1
{
    String fueltype;
    bmw(String color,String model,String fueltype)
    {
        super(color,model);
        this.fueltype=fueltype;
    }
    void bmwdetails()
    {
        System.out.println(color+" "+model+"  "+fueltype);
    }

}
public class singleinherit2 {
    public static void main(String[] args)
    {
        car1 obj2=new car1("black","2023");
        bmw  obj1=new bmw("blue","2023" ,"petrol");
        obj1.bmwdetails();
        obj2.cardetails();
    }
}
