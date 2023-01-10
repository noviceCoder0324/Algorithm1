import edu.princeton.cs.algs4.StdOut;

public class ex1_1_30 {

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        int r = a % b;
        return gcd(b, r);
    }

    public static boolean isPrime(int a, int b) {
        return gcd(a, b) == 1;
    }

    public static boolean[][] primeArray(int n) {
        boolean[][] res = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isPrime(i, j)) {
                    res[i][j] = true;
                }
            }
        }
        return res;
    }

    public static void print(boolean[][] x) {
        for (int i = 0; i < x.length; i++) {
            StdOut.printf("%2d", i);
            for (int j = 0; j < x[0].length; j++) {
                if (x[i][j]) {
                    StdOut.printf("%2s", "*");
                } else {
                    StdOut.printf("%2s", "-");
                }
            }
            StdOut.println();
        }
    }

    public static void main(String[] args) {
        boolean[][] x = primeArray(10);
        print(x);

    }
}
