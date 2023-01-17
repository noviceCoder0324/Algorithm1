import edu.princeton.cs.algs4.StdOut;

public class ex1_3_1 {
    public static void main(String[] args) {
        FixedCapacityStack<String> a = new FixedCapacityStack<>(10);
        while (!a.isFull()) {
            a.push("something");
        }
        for (int i = 0; i < 10; i++) {
            StdOut.println(a.pop());
        }

    }
}
