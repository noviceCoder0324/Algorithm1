import edu.princeton.cs.algs4.StdOut;

public class ex1_2_9 {
    public static int rank(int key, int[] a, Counter c) {

        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            c.increment();
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        Counter c = new Counter("counter");
        int[] a = new int[]{1, 2, 3, 4, 5};
        rank(2, a, c);
        StdOut.print(c.tally());

    }
}
