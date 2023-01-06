import edu.princeton.cs.algs4.StdOut;

public class ex1_1_14 {

    /**
     * find the log 2 of N
     *
     * @param N
     * @return
     */
    public static int lg(int N) {
        int product = 1;
        int i = 0;
        while (product < N) {
            product *= 2;
            i++;
        }
        return i - 1;
    }

    public static void main(String[] args) {
        int n = 100;
        int res = lg2(n);
        StdOut.print(res);
    }


    /**
     * This is a smarter way to do the same thing.
     *
     * @param N
     * @return
     */
    public static int lg2(int N) {

        int ret = 0;
        while (N > 0) {
            N /= 2;
            ret++;
        }
        return ret - 1;
    }

}
