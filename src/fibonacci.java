import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number is");
        int number=sc.nextInt();
        int first = 0;
        int second = 1;
        System.out.println((first +"\n"+ second));
        int sum = first + second;
        while (sum <= number) {
            System.out.println(sum);
            first = second;
            second = sum;
            sum = first + second;
        }

    }
}
