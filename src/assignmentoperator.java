import java.util.Scanner;

public class assignmentoperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value a:");
        int a = sc.nextInt();  //5
        System.out.println("Enter the value b:");
        int b = sc.nextInt();   //3
        System.out.println("+"+(a+=2)); // True and flase
        System.out.println("-="+(a-=2));    // f or t

        System.out.println("-="+(a*=2));
    }
}
