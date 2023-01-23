import edu.princeton.cs.algs4.StdOut;

public class ex1_3_8 {

    public static class DoublingStackOfStrings {

        private String[] a;
        private int N;

        public DoublingStackOfStrings() {
            a = new String[1];
            N = 0;
        }

        public void put(String item) {
            if (N == a.length) {
                resize(2 * a.length);
            }
            a[N] = item;
            N++;

        }

        public void resize(int x) {
            String[] res = new String[x];
            for (int i = 0; i < N; i++) {
                res[i] = a[i];
            }
            a = res;
        }

        public String pop() {
            if (N == 0) {
                throw new RuntimeException("Stack is empty");
            }
            N--;
            String item = a[N];
            if (N < a.length / 4) {
                resize(a.length / 2);
            }
            return item;
        }

        public boolean isEmpty() {
            return N == 0;
        }

        public int size() {
            return N;
        }

        public int sizeOfArray() {
            return a.length;
        }


    }

    public static void main(String[] args) {
        String[] test = new String[]{"it", "was", "-", "the", "best", "-", "of",
                "times", "-", "-", "-", "it", "was", "-", "the", "-", "-"};
        DoublingStackOfStrings stack = new DoublingStackOfStrings();
        for (String x : test) {

            if (!x.equals("-")) {
                stack.put(x);
            } else {
                StdOut.println(stack.pop());
            }
        }
        StdOut.println("There are " + stack.N + " items in the stack.");
        StdOut.println("The array is " + stack.sizeOfArray() + " long.");
    }
}
