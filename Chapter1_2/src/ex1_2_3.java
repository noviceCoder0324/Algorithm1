import edu.princeton.cs.algs4.*;

public class ex1_2_3 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double min = Double.parseDouble(args[1]);
        double max = Double.parseDouble(args[2]);
        StdDraw.setXscale(min, max);
        StdDraw.setYscale(min, max);
        StdDraw.setPenColor(StdDraw.BLACK);


        Interval2D[] intervals = new Interval2D[N];
        for (int i = 0; i < N; i++) {
            double x1 = StdRandom.uniformDouble(min, max);
            double x2 = StdRandom.uniformDouble(min, max);
            double y1 = StdRandom.uniformDouble(min, max);
            double y2 = StdRandom.uniformDouble(min, max);
            Interval1D x = x1 < x2 ? new Interval1D(x1, x2) : new Interval1D(x2, x1);
            Interval1D y = y1 < y2 ? new Interval1D(y1, y2) : new Interval1D(y2, y1);
            intervals[i] = new Interval2D(x, y);
            intervals[i].draw();
//            StdDraw.rectangle(Math.min(x1, x2) + Math.abs(x2 - x1) / 2,
//                    Math.min(y1, y2) + Math.abs(y2 - y1) / 2,
//                    Math.abs(x2 - x1) / 2, Math.abs(y2 - y1) / 2);
        }

        int numberOfIntervals = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (intervals[i].intersects(intervals[j])) {
                    numberOfIntervals++;

                }
            }
        }
        StdOut.println("Number of pairs of intervals that intersect are: " + numberOfIntervals);

        //我不会找出contained的数字的方法。我觉得需要四个点坐标才可以
        //但是interval2D没有给出坐标的methods，除非redesign
        //我看别的答案也没有这部分。所以就过了把。
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) continue;
                Interval2D int_i = intervals[i];
                Interval2D int_j = intervals[j];

            }
        }
    }
}
