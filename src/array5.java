import java.util.Scanner;
public class array5 {
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
        System.out.println("array elements are:");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }

    }
}
