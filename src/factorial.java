import java.util.Scanner;
public class factorial {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        System.out.println("eneter the number:");
        int factorial=1;
        for(int i=1;i<=number;i++)
        {
            factorial=factorial*i;

        }
        System.out.println(factorial);
    }
}
