import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

public class ex1_1_31 {


    public static void drawCircleConnection(int N, double p) {

        //draw a circle on canvas
        StdDraw.setCanvasSize(640, 640);
        StdDraw.setScale(-1.2, 1.2);
        StdDraw.circle(0, 0, 1);

        //make the dot bigger
        StdDraw.setPenRadius(0.05);

        //save points in this matrix
        double[][] points = new double[N][2];
        for (int i = 0; i < N; i++) {
            double x_pos = Math.cos(2 * Math.PI * i / N);//???what is this???
            double y_pos = Math.sin(2 * Math.PI * i / N);
            StdDraw.point(x_pos, y_pos);

            points[i][0] = x_pos;
            points[i][1] = y_pos;
        }

        StdDraw.setPenColor(StdDraw.GRAY);
        StdDraw.setPenRadius();
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (StdRandom.bernoulli(p)) {
                    StdDraw.line(points[i][0], points[i][1], points[j][0], points[j][1]);
                }
            }
        }

    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double p = Double.parseDouble(args[1]);
        drawCircleConnection(N, p);


    }
}
