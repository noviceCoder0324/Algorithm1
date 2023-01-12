import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class ex1_2_1 {


    public static void main(String[] args) {
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setPenRadius(0.05);

        int N = Integer.parseInt(args[0]);
        Point2D[] x = new Point2D[N];
        for (int i = 0; i < N; i++) {
            x[i] = new Point2D(StdRandom.uniformDouble(), StdRandom.uniformDouble());
            x[i].draw();
        }

        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.setPenRadius(0.001);

        double min_distance = Double.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                StdDraw.line(x[i].x(), x[i].y(), x[j].x(), x[j].y());
                min_distance = Math.min(min_distance, x[i].distanceTo(x[j]));
            }
        }
        StdOut.println(min_distance);

    }
}
