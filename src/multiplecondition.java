import java.util.Scanner;
public class multiplecondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value a:");
        int a = sc.nextInt();  //5
        System.out.println("Enter the value b:");
        int b = sc.nextInt();
        System.out.println("Enter the value c:");
        int c = sc.nextInt();
        if (a >= b && a >= c) {
            System.out.println(a + "is larger");
        } else if (b >= a && b >= c) {
            System.out.println(b + "is larger");
        } else {
            System.out.println(c + "is larger");
        }
    }
}

