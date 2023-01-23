import edu.princeton.cs.algs4.StdOut;

public class ex1_3_6 {
    public static void main(String[] args) {
        //reverse the queue
        Queue<String> q = new Queue<>();
        q.enqueue("1");
        q.enqueue("2");
        q.enqueue("3");
        Stack<String> stack = new Stack<>();
        while (!q.isEmpty()) {
            stack.push(q.dequeue());
        }
        while (!stack.isEmpty()) {
            q.enqueue(stack.pop());
        }

        for (String s : q) {
            StdOut.print(s);
        }
    }
}
