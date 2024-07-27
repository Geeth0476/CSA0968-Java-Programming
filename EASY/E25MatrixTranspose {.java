public class E25MatrixTranspose {
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] trans = new int[3][2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                trans[i][j] = mat[j][i];
            }
        }

        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(trans[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
