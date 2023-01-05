import edu.princeton.cs.algs4.StdOut;

public class ex1_1_9 {
    public static void main(String[] args) {
        int N = 99123;
        String s = "";
        for (int n = N; n > 0; n /= 2) {
            s = (n % 2) + s;
        }
        StdOut.println(s);
    }
}
