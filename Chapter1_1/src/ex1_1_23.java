import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class ex1_1_23 {

    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        In x = new In(args[0]);
        int[] whilelist = x.readAllInts();
        Arrays.sort(whilelist);
        String op = args[1];

        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            int rank = rank(key, whilelist);
            if (rank < 0 && op.equals("+")) {
                StdOut.println(key);
            } else if (rank >= 0 && op.equals("-")) {
                StdOut.println(key);
            }

        }
    }
//      which one is better???
//        if (op.equals("+")) {
//            while (!StdIn.isEmpty()) {
//                int key = StdIn.readInt();
//                if (rank(key, whilelist) < 0) {
//                    StdOut.println(key);
//                }
//            }
//        } else if (op.equals("-")) {
//            while (!StdIn.isEmpty()) {
//                int key = StdIn.readInt();
//                if (rank(key, whilelist) >= 0) {
//                    StdOut.println(key);
//                }
//            }


}
