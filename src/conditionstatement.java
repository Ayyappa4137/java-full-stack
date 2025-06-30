import javax.swing.*;
import java.util.Scanner;

public class conditionstatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age is:");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("your eligible for voting");
        } else {
            System.out.println("not eligible for voting");
        }
    }
}

