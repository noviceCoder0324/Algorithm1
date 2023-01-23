import edu.princeton.cs.algs4.StdOut;

public class ex1_3_4 {
    public static void main(String[] args) {
        //argument:
        //[()]{}{[()()]()}  true
        //[(]) false
        char[] x = "[(])".toCharArray();

        boolean res = parentheses(x);
        StdOut.print(res);
    }

    private static boolean parentheses(char[] x) {
        Stack<Character> stack = new Stack<>();

        for (char c : x) {
            if (leftParen(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char d = stack.pop();
                if (!correspond(c, d)) return false;

            }
        }
        return stack.isEmpty();

    }

    private static boolean correspond(char c, char d) {
        if (d == '[') return c == ']';
        if (d == '{') return c == '}';
        if (d == '(') return c == ')';
        return false;
    }

    private static boolean leftParen(char c) {
        return c == '[' || c == '{' || c == '(';
    }
}
