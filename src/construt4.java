class car
{
    String car_name;
   String car_model;
    String color;
     double  price;
    car(String b,String a,String c,double d)
    {
        car_name=a;
        car_model=b;
        color=c;
        price=d;
    }
    public void car_details()
    {
        System.out.println("name="+car_name+"\n model="+car_model+"\n colour="+color+"\n price="+price);

    }
    public void car2()
    {
        System.out.println("name="+car_name+"\n model="+car_model+"\n colour="+color);

    }
}

public class construt4 {

    public static void main(String[] args)
    {
        car obj=new car("THAR","MAHINDRA","BLACK" ,1700000);
        obj.car_details();
        car obj1= new car("toyota","lexus","black",0);
        obj1.car2();
    }
}








