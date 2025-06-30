import java.util.Scanner;

public class bitwiseoperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value a:");
        int a = sc.nextInt();  //5
        System.out.println("Enter the value b:");
        int b = sc.nextInt();   //3
        System.out.println("BITWISE AND " + (a & b)); // True and flase
        System.out.println("BITWISE OR " + (a | b));    // f or t
        System.out.println("BITWISE XOR " + (a ^ b));
        System.out.println("compliment " + (~a));
        System.out.println("left shift " + (a<<3));
        System.out.println("right shift "+(a>>1));

    }
}
