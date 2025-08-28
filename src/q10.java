public class q10 {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];


        int value = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = value++;
            }
        }


        System.out.println("3x3 Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }


        int primarySum = 0;
        for (int i = 0; i < 3; i++) {
            primarySum += matrix[i][i];
        }


        int secondarySum = 0;
        for (int i = 0; i < 3; i++) {
            secondarySum += matrix[i][2 - i];
        }

        System.out.println("\nPrimary Diagonal Sum = " + primarySum);
        System.out.println("Secondary Diagonal Sum = " + secondarySum);
    }
}
