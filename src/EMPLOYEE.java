import java.util.Scanner;
public class EMPLOYEE
{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your employee name");
            String name = sc.nextLine();
            System.out.println("Enter your department name");
            String depart = sc.nextLine();
            System.out.println("Enter your company name");
            String company = sc.nextLine();
            System.out.println("Enter your employee id");
            String Eid = sc.nextLine();
            System.out.println("Enter your employee salary");
            double salary = sc.nextDouble();
            System.out.println(name);
            System.out.println(depart);
            System.out.println(company);
            System.out.println(Eid);
            System.out.println(salary);
        }
}

