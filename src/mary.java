import java.util.Scanner;
class java {
    public void person(String name, int age) {

        System.out.println(name+" "+age);
    }
public void dog (String dname,String dcolor)

    {
        System.out.println(dname+" " +dcolor);
    }
}
public class mary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter dname and dcolor of dog");
        String dname = sc.nextLine();
        String dcolor = sc.nextLine();
        System.out.println("enter name and age");
        String name = sc.nextLine();
        int age = sc.nextInt();
        java obj = new java();
        obj.person(name, age);
        obj.dog(dname,dcolor);

    }
}
