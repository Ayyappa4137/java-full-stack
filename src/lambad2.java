import java.util.Scanner;

interface qq2 {
    void add(int a, int b);
}

interface qq3 {
    void sub(int a, int b);
}

interface qq4 {
    void multi(int a, int b);
}

//interface qq5 {
//    void div(int a, int b);
//}

public class lambad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        // Lambda expressions
        qq2 obj1 = (x, y) -> System.out.println("Addition: " + (x + y));
        qq3 obj2 = (x, y) -> System.out.println("Subtraction: " + (x - y));
        qq4 obj3 = (x, y) -> System.out.println("Multiplication: " + (x * y));


        // Call methods using user input
        obj1.add(a, b);
        obj2.sub(a, b);
        obj3.multi(a, b);
       // obj4.div(a, b);

        sc.close();
    }
}


