import edu.princeton.cs.algs4.StdDraw;

public class VisualCounter {

    private int N; //max number of operations
    private double n;
    private int max; //max absolute value
    private int count;

    public VisualCounter(int N, int max) {
        count = 0;
        n = 0.0; // current operation number
        this.N = N;
        this.max = max;
        StdDraw.setXscale(0, N);
        StdDraw.setYscale(-max, max);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.point(n, count);

    }

    public void increment() {
        count++;
        n += 1.0;
        StdDraw.point(n, count);
    }

    public void decrement() {
        count--;
        n += 1.0;
        StdDraw.point(n, count);
    }

    public int tally() {
        return count;
    }
}
