import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class ex1_1_13 {


    /**
     * Generate two-dimensional array
     *
     * @param r
     * @param c
     * @return
     */
    public static int[][] genTwoDimIntArray(int r, int c) {
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = StdRandom.uniformInt(10);
            }
        }
        return res;
    }

    /**
     * Get the transposition of a matrix
     *
     * @param matrix
     * @return
     */
    public static int[][] transposition(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] res = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res[i][j] = matrix[j][i];
            }
        }
        return res;
    }

    public static void print(int[][] array) {
        StdOut.print(" ");
        for (int j = 0; j < array[0].length; j++) {
            StdOut.printf("%3d", j);

        }
        StdOut.println();
        for (int i = 0; i < array.length; i++) {
            StdOut.print(i);
            for (int j = 0; j < array[0].length; j++) {
                StdOut.printf("%3s", array[i][j]);
            }
            StdOut.println();
        }
    }


    public static void main(String[] args) {
        int[][] x = genTwoDimIntArray(5, 8);
        int[][] y = transposition(x);

        print(x);

        StdOut.print("_______");
        StdOut.println();

        print(y);
    }
}
