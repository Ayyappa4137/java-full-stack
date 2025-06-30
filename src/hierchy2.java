class fruit{
    String season;
    fruit(String S)
    {
        this.season=S;
    }
    void fdetails(){
        System.out.println(season+"");
    }
}
class apple extends fruit{
    String color;
    apple(String S,String color)
    {
        super(S);
        this.color=color;
    }
    void fsdetails()
    {
        System.out.println(color+""+season);
    }

}
class mango extends fruit {
    double price10;

    mango(String S, String color, double price10) {
        super(S);
        this.price10 = price10;
    }
    void fmdetails()
    {
        System.out.println(price10+"\n"+season+""+price10);
    }

}

public class hierchy2 {
    public static void main(String[] args){
        apple obj=new apple("winter","red");
        obj.fsdetails();
        mango obj1=new mango("summer", "yellow",100);
        obj1.fmdetails();
    }
}
