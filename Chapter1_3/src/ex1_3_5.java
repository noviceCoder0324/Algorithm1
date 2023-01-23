import edu.princeton.cs.algs4.StdOut;

public class ex1_3_5 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        Stack<Integer> stack = new Stack<>();
        while (N > 0) {
            stack.push(N % 2);
            N = N / 2;
        }
        for (int d : stack) StdOut.print(d);
        StdOut.println();
    }
}
