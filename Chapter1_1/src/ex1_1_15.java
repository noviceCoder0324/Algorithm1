import edu.princeton.cs.algs4.StdOut;

public class ex1_1_15 {

    /**
     * take in an array and count how many each number it has,
     * then save it in another array.
     *
     * @param a
     * @param M
     * @return
     */
    public static int[] histogram(int[] a, int M) {
        int[] res = new int[M];
        for (int j : a) {
            res[j]++;
        }
        return res;
    }

    public static void print(int[] res) {
        for (int i = 0; i < res.length; i++) {
            StdOut.print(res[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        int[] res = histogram(a, 6);
        print(res);
    }
}
