import edu.princeton.cs.algs4.StdOut;

public class ex1_3_9 {

    public static String addParentheses(String[] str) {

        Stack<String> others = new Stack<>();
        Stack<String> ops = new Stack<>();

        for (String c : str) {
            if (c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/")) {
                ops.push(c);
            } else if (c.equals(")")) {
                String right = others.pop();
                String left = others.pop();
                String part = "(" + left + ops.pop() + right + ")";
                others.push(part);
            } else {
                others.push(c);
            }
        }
        return others.pop();

    }


    public static void main(String[] args) {

        String[] test = new String[]{"1", "+", "2", ")", "*", "3", "-", "4", ")", "*", "5", "-", "6", ")", ")", ")"};

        StdOut.println(addParentheses(test));
    }
}
