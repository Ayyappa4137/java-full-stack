import java.util.Scanner;

public class grademarks {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the marks is:");
            int marks=sc.nextInt();
            int grade=marks/10;
            switch(grade)
            {
                case 10:
                    System.out.println("A+");
                    break;
                case 9:
                    System.out.println("A");
                    break;
                case 8:
                    System.out.println("B+");
                    break;
                case 7:
                    System.out.println("B");
                    break;
                case 5:
                    System.out.println("C+");
                    break;
                case 3:
                    System.out.println("C");
                    break;


                default:
                    System.out.println("enetr thevalid number");
                    break;

            }
        }
    }


