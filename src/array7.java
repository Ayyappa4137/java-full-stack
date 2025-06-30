
    //find the reverse value in a array:
import java.util.Scanner;
public class array7 {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the size of an elements are:");
            int n=sc.nextInt();
            int array[]=new int[n];
            System.out.println("enter the array elements:");
            for(int i=0;i<array.length;i++)
            {
                array[i]=sc.nextInt();
            }
           for(int i=n-1;i>=0;i--){
               System.out.println(array[i]);
            }

            System.out.println("array elements are:");
            for(int i=0;i<array.length;i++){
                System.out.println(array[i]);
            }

        }
    }

