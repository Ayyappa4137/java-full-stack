import java.util.Scanner;
public class userinput {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a val");
        int a=sc.nextInt();
        System.out.println("Enter b val");
        int b=sc.nextInt();
        System.out.println("sum="+(a+b));
    }
}
