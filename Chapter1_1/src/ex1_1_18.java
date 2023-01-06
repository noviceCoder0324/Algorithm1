import edu.princeton.cs.algs4.StdOut;

public class ex1_1_18 {

    /**
     * time all a when b is odd.
     * square a each time
     *
     * @param a
     * @param b
     * @return
     */
    public static int mystery2(int a, int b) {
        if (b == 0) return 1;
        if (b % 2 == 0) return mystery2(a * a, b / 2);
        return mystery2(a * a, b / 2) * a;
    }

    /**
     * add all a when b is odd
     * a times 2 each time
     *
     * @param a
     * @param b
     * @return
     */
    public static int mystery(int a, int b) {
        if (b == 0) return 0;
        if (b % 2 == 0) return mystery(a + a, b / 2);
        return mystery(a + a, b / 2) + a;
    }

    public static void main(String[] args) {
        int x = mystery(2, 25);
        int y = mystery(3, 11);
        StdOut.println(x);
        StdOut.println(y);

    }
}

/**
 * mystery(2, 25)
 * mystery(4, 12)
 * mystery(8, 6)
 * mystery(16, 3)
 * mystery(32, 1)
 * 2 + 16 + 32;
 * <p>
 * <p>
 * <p>
 * mystery(3, 11)
 * mystery(6, 5)
 * mystery(12, 2)
 * mystery(24, 1)
 * 3 + 6 + 24
 */
