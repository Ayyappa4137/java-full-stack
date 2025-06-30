//find the maximum value in a array:
import java.util.Scanner;

public class array6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an elements are:");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("enter the array elements:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
              /* int min=array[0];
                for(int j=1;i<array.length;i++)
               if (array[j]<min)
               {
                    min=array[j];
            }
            }
            System.out.println("MAXIMUM Element in Array is:"+min);*/
            System.out.println("MAXIMUM Element in Array is:" +max);
            System.out.println("array elements are:");
            //for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }

        }
    }


