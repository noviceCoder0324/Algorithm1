import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class ex1_1_29 {

    //binary search找到左边rank
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return a[lo] == key ? lo : -1;
    }

    public static int count(int key, int[] a) {
        int rank = rank(key, a);
        int right_rank = right_rank(key, a);
        return right_rank - rank + 1;
    }

    //binary search找到右边rank
    private static int right_rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo < hi) {
            //这个是最重要的。这里mid要是hi-lo+1，才能拿到右侧的那个值
            int mid = lo + (hi - lo + 1) / 2;
            if (key > a[mid]) {
                lo = mid; //这样，这里就不用再+1了，因为已经是右边的那个值了。
            } else if (key < a[mid]) {
                hi = mid - 1;
            } else {
                lo = mid;
            }
        }
        return a[lo] == key ? lo : -1;

    }


    public static void print(int[] a) {
        for (int j : a) {
            StdOut.println(j);
        }
    }

    public static void main(String[] args) {
        In x = new In(args[0]);
        int[] whitelist = x.readAllInts();

        Arrays.sort(whitelist);
        print(whitelist);

        int y = rank(321, whitelist);
        StdOut.println(y);

        int z = right_rank(321, whitelist);
        StdOut.println(z);


    }
}
