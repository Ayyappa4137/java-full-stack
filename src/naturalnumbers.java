import java.util.Scanner;
public class naturalnumbers{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter number is");
            int number=sc.nextInt();
            int i= 1;
            int sum = 0;
            do {

                sum += i;
                i++;
            }while(i<=number);
            System.out.println(sum);
            }

        }



