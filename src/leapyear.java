import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = sc.nextInt();  //5
        if ((year%4==0 && year%100!=0)||(year%4==0))
        {
            System.out.println("it is leap year");
        }
           else
        {
            System.out.println("it is not leap year");
        }
    }
}
