import java.util.Scanner;

public class switchexample
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1 to 7");
        int day=sc.nextInt();
        switch(day)
        {
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("MON");
                break;
            case 3:
                System.out.println("TUE");
                break;
            case 4:
                System.out.println("wed");
                break;
            case 5:
                System.out.println("THURSday");
                break;
            case 6:
                System.out.println("fri");
                break;
            case 7:
                System.out.println("sat");
                break;
            default:
                System.out.println("enetr thevalid number");
                break;

        }
    }
}
