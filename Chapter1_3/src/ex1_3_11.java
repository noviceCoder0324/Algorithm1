import edu.princeton.cs.algs4.StdOut;

public class ex1_3_11 {


    public static double EvaluatePostfix(String[] exprs) {
        Stack<String> nums = new Stack<>();
        for (String s : exprs) {
            if (s.matches("\\d")) {
                nums.push(s);
            } else if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                double r = Double.parseDouble(nums.pop());
                double l = Double.parseDouble(nums.pop());
                switch (s) {
                    case "+" -> nums.push(String.valueOf(l + r));
                    case "-" -> nums.push(String.valueOf(l - r));
                    case "*" -> nums.push(String.valueOf(l * r));
                    default -> nums.push(String.valueOf(l / r));
                }
            }
        }
        return Double.parseDouble(nums.pop());
    }

    public static void main(String[] args) {
        String[] test = Util.toStringArray("5 3 4 * + 2 3 * - 3 / 1 3 + + ");
        StdOut.print(EvaluatePostfix(test));
    }
}
