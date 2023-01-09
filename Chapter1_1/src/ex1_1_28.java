import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class ex1_1_28 {
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.println(a[i]);
        }
    }

    public static void main(String[] args) {
        In x = new In(args[0]);
        int[] whitelist = x.readAllInts();

        Arrays.sort(whitelist);
        whitelist = removeDuplicate(whitelist);
        print(whitelist);

    }

    private static int[] removeDuplicate(int[] whitelist) {
        int slow = 0;
        int fast = 1;
        while (fast < whitelist.length) {
            if (whitelist[slow] != whitelist[fast]) {
                slow++;
                whitelist[slow] = whitelist[fast];
            }
            fast++;
        }
        return Arrays.copyOf(whitelist, slow + 1);
    }
}
