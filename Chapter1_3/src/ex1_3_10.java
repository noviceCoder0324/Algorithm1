import edu.princeton.cs.algs4.StdOut;


public class ex1_3_10 {

    public static String infixToPostfix(String[] strs) {
        Stack<String> ops = new Stack<>();
        Stack<String> exprs = new Stack<>();

        for (String s : strs) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                ops.push(s);
            } else if (s.equals(")")) {
                String right = exprs.pop();
                String left = exprs.pop();
                String ans = "(" + left + right + ops.pop() + ")";
                exprs.push(ans);
            } else if (s.equals("(")) {
                continue;
            } else {
                exprs.push(s);
            }
        }
        return exprs.pop();
    }

    public static void main(String[] args) {
        String[] test2 = Util.toStringArray("((1+2)*((3-4)*(5-6)))");
        //String[] test = new String[]{"(", "(", "1", "+", "2", ")", "*", "(", "(", "3", "-", "4", ")", "*", "(", "5", "-", "6", ")", ")", ")"};
        StdOut.println(infixToPostfix(test2));
    }
}
