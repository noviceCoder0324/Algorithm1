import edu.princeton.cs.algs4.StdOut;

public class ex1_1_19 {

    long[] fib = new long[100];

    public long F(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        if (fib[N] != 0) {
            return fib[N];
        } else {
            fib[N] = F(N - 1) + F(N - 2);
            return fib[N];
        }
    }

    /**
     * print all fibonacci number
     *
     * @param args
     */
    public static void main(String[] args) {

        ex1_1_19 a = new ex1_1_19();
        for (int N = 0; N < 100; N++) {
            StdOut.println(N + " " + a.F(N));
        }
    }
}
