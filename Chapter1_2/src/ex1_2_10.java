import edu.princeton.cs.algs4.StdRandom;

public class ex1_2_10 {
    public static void main(String[] args) {
        VisualCounter vc = new VisualCounter(1000, 100);
        for (int i = 0; i < 1000; i++) {
            if (StdRandom.bernoulli()) {
                vc.increment();
            } else {
                vc.decrement();
            }
        }
    }
}
