import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

public class ex1_1_32 {
    public static void main(String[] args) {
        int N = 6;
        double l = 1.0;
        double r = 100.0;

        double[] vals = genRandomDoules(N, l, r);
        histogram(N, l, r, vals);
    }

    private static void histogram(int N, double l, double r, double[] vals) {
        StdDraw.setCanvasSize(512, 256);
        StdDraw.setXscale(l, r);
        StdDraw.setYscale(0, vals.length + 10);
        int[] freq = new int[N];
        for (int i = 0; i < vals.length; i++) {
            int occurIndex = (int) ((vals[i] - l) / (r - l) * N);
            freq[occurIndex]++; // so smart!!!
        }

        double w = (r - l) / N; //width of a rectangle
        for (int i = 0; i < N; i++) {
            double x = l + w / 2.0 + w * i;
            double y = freq[i] / 2.0;
            double rw = w / 4.0; //长方形之间不要紧贴在一起
            double rh = freq[i] / 2.0;
            StdDraw.filledRectangle(x, y, rw, rh);
            StdDraw.text(x, 2 * y + 10, freq[i] + "");
        }

    }

    public static void test() {
        int N = 50;
        double[] a = new double[N];
        for (int i = 0; i < N; i++) {
            a[i] = StdRandom.uniformDouble();
        }
        for (int i = 0; i < N; i++) {
            double x = 1.0 * i / N;
            double y = a[i] / 2.0;
            double rw = 0.5 / N;
            double rh = a[i] / 2.0;
            StdDraw.filledRectangle(x, y, rw, rh);
        }
    }

    public static double[] genRandomDoules(int N, double lower, double upper) {
        double[] vals = new double[N];
        for (int i = 0; i < N; i++) {
            vals[i] = StdRandom.uniform(lower, upper);
        }
        return vals;
    }

}
