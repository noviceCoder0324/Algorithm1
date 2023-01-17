import edu.princeton.cs.algs4.StdOut;

public class ex1_3_2 {
    public static void main(String[] args) {
        Stack<String> a = new Stack<>();
        String[] x = new String[]{"it", "was", "-", "the", "best",
                "-", "of", "times", "-", "-", "-", "it", "was", "-", "the", "-", "-"};

        for (int i = 0; i < x.length; i++) {
            String s = x[i];
            if (!s.equals("-")) {
                a.push(s);
            } else if (!a.isEmpty()) {
                StdOut.println(a.pop() + " has been popped out.");
            }
        }

        StdOut.println(a.size() + " is left");
    }
}
