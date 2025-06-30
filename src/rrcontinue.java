import java.util.Scanner;
public class rrcontinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number is");
        {
            int x = 10;
            while (x < 15) {
                x++;
                if (x == 12)
                {
                    continue;
                }
                System.out.println(x);
                System.out.println("");
            }
        }
        }
    }


