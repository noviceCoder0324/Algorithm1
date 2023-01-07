import edu.princeton.cs.algs4.StdOut;

public class ex1_1_22 {

    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1, 0);
    }

    public static int rank(int key, int[] a, int lo, int hi, int depth) {
        StdOut.print("lo: " + lo);
        StdOut.print(" hi: " + hi);
        StdOut.println(" level: " + depth);
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) return rank(key, a, lo, mid - 1, depth + 1);
        else if (key > a[mid]) return rank(key, a, mid + 1, hi, depth + 1);
        else return mid;
    }

    public static void main(String[] args) {
        int x = rank(5, new int[]{1, 3, 5, 7, 8});
        StdOut.print(x);
    }
}
