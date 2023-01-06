import edu.princeton.cs.algs4.StdOut;

public class ex1_1_20 {

    /**
     * return the ln of (factorial of N)
     *
     * @param N
     * @return
     */
    public static double ln(int N) {
        if (N <= 1) return 1;
        return ln(N - 1) + Math.log(N);
    }

    public static void main(String[] args) {
        double x = ln(50);
        StdOut.println(x);
    }
}
