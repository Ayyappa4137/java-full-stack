import java.util.Scanner;
    public class arthmeticoperator
    {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value a:");
            int a = sc.nextInt();
            System.out.println("Enter the value b:");
            double b = sc.nextDouble();
            System.out.println("addition " + (a + b));
            System.out.println("substraction " + (a - b));
            System.out.println("mutiplication " + (a * b));
            System.out.println("division " + (a / b));
        }
    }