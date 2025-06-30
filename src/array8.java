import java.util.Scanner;

public class array8 //find the maximum value in a array:
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an elements are:");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("enter the array elements:");
        int even=0,odd=0;
        for (int i=0;i<array.length;i++) {
            array[i] = sc.nextInt();
            if(array[i]%2==0)

                even++;
          else
              odd++;
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

            }
        System.out.println("MAXIMUM Element in Array is:" +max);
        System.out.println("EVEN Element in Array is:" +even);
        System.out.println("ODD Element in Array is:" +odd);
            System.out.println("array elements are:");
            for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}

