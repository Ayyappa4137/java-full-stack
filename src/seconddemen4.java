import java.util.Scanner;

public class seconddemen4 {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the number rows and columnS:");
            int row=sc.nextInt();
            int col=sc.nextInt();
            int[][] matrix1=new int[row][col];
            int [][] transpose=new int[col][row];

            System.out.println("enter elements for 1st matrix");
            for(int i=0;i<row;i++)
            {
                for(int j=0;j<col;j++){
                    matrix1[i][j]= sc.nextInt();

                }
            }

            for(int i=0;i< row;i++)
            {
                for(int j=0;j<col;j++){
                    transpose[j][i]=matrix1[i][j];
            }

            }
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(transpose[i][j] + " ");
                }
                System.out.println();
            }

        }

    }


