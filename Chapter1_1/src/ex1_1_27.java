import edu.princeton.cs.algs4.StdOut;

public class ex1_1_27 {

    /**
     * 二项分布，N是一共有几个硬币，k是正面的个数，p是硬币抛一次能正的概率。
     * 得到的结果，是N个硬币里，k个正面这种结果得到的概率是多少。
     * N=5，k=1，p=0。5，结果就应该是5/32，因为一共有32种可能性，而5是正面有5种正面的可能。
     *
     * @param N
     * @param k
     * @param p
     * @return
     */

    public static double binomial_modified(int N, int k, double p) {
        double[][] f = new double[N + 1][k + 1];

        // f(0,0,p)，如果是什么都没有，结果就一定是这个结果，就是1。0
        f[0][0] = 1.0;

        //f(N,0,p)，如果是N个东西，里面一个都没有，这个的应该取决于p？？？
        for (int i = 1; i < N + 1; i++) {
            // 递推公式
            f[i][0] = (1.0 - p) * f[i - 1][0] + 0.0;
        }

        // f(N,k,p)
        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < k + 1; j++) {

                // 递推公式
                f[i][j] = (1.0 - p) * f[i - 1][j] + p * f[i - 1][j - 1];
            }
        }

        return f[N][k];
    }

    public static double binomial(int N, int k, double p) {
        if (N == 0 && k == 0) {
            return 1.0;
        } else if (N < 0 || k < 0) {
            return 0.0;
        } else {
            return (1.0 - p) * binomial(N - 1, k, p) + p * binomial(N - 1, k - 1, p);
        }
    }


    public static void main(String[] args) {

        double x = binomial_modified(5, 1, 0.5);
        StdOut.print(x);
    }
}
