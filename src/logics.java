import java.util.Scanner;

class ope
{
    public void sum(int a, int b)
    {
        System.out.println("sum="+(a+b));
    }
    public void multiply(int a, int b)
    {
        System.out.println("mul="+(a*b));
    }
    public void substraction(int a, int b)
    {
        System.out.println("sub="+(a-b));
    }
    public void division(int a, int b)
    {
        System.out.println("div="+(a/b));
    }
    public void main(int a ,int b)
    {
        if(b!=0){
            System.out.println(a/b);
        }
        else
        {
            System.out.println("denaminator should be non zero values");
        }
    }
}
public class logics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a and b value ");
        int a= sc.nextInt();
        //System.out.println("enter b value ");
        int b= sc.nextInt();
        ope obj=new ope();
        obj.sum(a,b);
        obj.substraction(a,b);
        obj.multiply(a,b);
        obj.division(a,b);


    }
}
