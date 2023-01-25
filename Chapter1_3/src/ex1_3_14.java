import edu.princeton.cs.algs4.StdOut;

public class ex1_3_14 {
    public static class ResizingArrayQueueOfStrings {
        private String[] array;
        private int first;
        private int last;
        private int N;

        public ResizingArrayQueueOfStrings() {
            first = 0;
            last = 0;
            N = 0;
            array = new String[5];
        }

        public void enqueue(String item) {
            if (N == array.length) {
                resize(N * 2);
            }
            array[last] = item;
            last = index(last + 1);
            N++;
        }

        private int index(int i) {
            if (i >= 0 && i < array.length) {
                return i;
            } else if (i < 0) {
                return array.length - 1;
            } else {
                return 0;
            }
        }

        public String dequeue() {
            assert N > 0;

            if (N < array.length / 4) {
                resize(array.length / 2);
            }

            String res = array[first];
            first = index(first + 1);
            N--;
            return res;
        }

        private void resize(int i) {
            String[] res = new String[i];
            if (first < last) {
                System.arraycopy(array, first, res, 0, N);
            } else {
                System.arraycopy(array, first, res, 0, array.length - first);
                System.arraycopy(array, 0, res, array.length - first, last);
            }
            first = 0;
            last = N;
            array = res;

        }

        public boolean isEmpty() {
            return N == 0;
        }

        public int size() {
            return N;
        }

    }

    public static void main(String[] args) {
        String[] inputs = "it is the best of times".split("\\s+");
        ResizingArrayQueueOfStrings queue = new ResizingArrayQueueOfStrings();
        for (String x : inputs) {
            queue.enqueue(x);
        }

        for (int i = 0; i < inputs.length; i++) {
            StdOut.println(queue.dequeue());
        }

    }
}
