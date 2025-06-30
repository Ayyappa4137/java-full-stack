import java.util.Scanner;
public class biodata {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your usn");
        String usn= sc.nextLine();
        System.out.println("Enter your branch");
        String branch = sc.nextLine();
        System.out.println("Enter your percentage");
        float  per= sc.nextFloat();
         System.out.println(name);
        System.out.println(usn);
        System.out.println(branch);
        System.out.println(per);


    }
}
