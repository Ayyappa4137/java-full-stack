public class twodementional2 {
        public static void main(String[] args) {
            int[][] matrix = {{1, 2, 3},
                              {4, 5, 6},
                              {7, 8, 9}
            };
            for (int i = 0; i < matrix.length; i++) {

                    System.out.print(matrix[i][i] + " ");
                }
                System.out.println();
            for (int i = 0; i < matrix.length; i++) {

                System.out.print(matrix[i][matrix.length-1-i] + " ");

            }

            }


        }


