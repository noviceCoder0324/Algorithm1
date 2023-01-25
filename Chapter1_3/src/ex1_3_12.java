import edu.princeton.cs.algs4.StdOut;

public class ex1_3_12 {

    public static Stack<String> Copy(Stack<String> stack) {
        Stack<String> temp = new Stack<>();
        for (String s : stack) {
            temp.push(s);
        }
        Stack<String> res = new Stack<>();
        for (String s : temp) {
            res.push(s);
        }
        return res;
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        String[] inputs = "it is the best of times".split("\\s+");
        for (String x : inputs) {
            stack.push(x);
        }
        Stack<String> newStack = Copy(stack);
        for (String x : newStack) {
            StdOut.println(x);
        }

    }
}
