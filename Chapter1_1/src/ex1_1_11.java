import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class ex1_1_11 {

    /**
     * print the boolean array
     *
     * @param array
     */
    public static void print(boolean[][] array) {
        StdOut.print(" ");
        for (int j = 0; j < array[0].length; j++) {
            StdOut.printf("%3d", j); // in 3 digits?

        }
        StdOut.println();
        for (int i = 0; i < array.length; i++) {
            StdOut.print(i);
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j]) {
                    StdOut.printf("%3s", "*"); // in 3 spaces?
                } else {
                    StdOut.printf("%3s", " ");
                }
            }
            StdOut.println();
        }
    }

    /**
     * generate random boolean array[][]
     *
     * @param m
     * @param n
     * @return
     */
    public static boolean[][] genBoo(int m, int n) {
        boolean[][] res = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = StdRandom.bernoulli();
            }
        }
        return res;
    }

    public static void main(String[] args) {
        boolean[][] array = genBoo(8, 10);

        print(array);
    }
}
