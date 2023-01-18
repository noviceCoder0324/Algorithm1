import edu.princeton.cs.algs4.StdOut;

public class ex1_3_3 {

    public static boolean possibleSequence(int[] seq) {
        ResizingArrayStack<Integer> stack = new ResizingArrayStack<>();
        boolean[] mark = new boolean[10];//why?
        for (int i = 0; i <= seq[0]; i++) {//seq[0] 是第一个数字，他前面所有的数都要被push进去
            stack.push(i);
            mark[i] = true;//说明这个数字已经被push进去了
        }

        StdOut.printf("%d ", stack.pop()); // first element，第一个显示出来的数字

        for (int i = 1; i < seq.length; i++) {//针对seq里面的除第一个以外的其他数字
            //如果stack里面空了，说明下一个出现的又要开始push了，甚至即便没空，如果里面的东西比下一个小，那说明之前的全都被push进去了。
            if ((!stack.isEmpty() && stack.peek() <= seq[i]) || stack.isEmpty()) {

                //实际把小东西全push进去。
                for (int j = 0; j <= seq[i]; j++) {
                    if (mark[j] == false) {
                        stack.push(j);
                        mark[j] = true;
                    }
                }
            }
            //如果stack里面有东西，而且里面的比下面出现的一个要大，就要放出来。
            int pop = stack.pop();
            StdOut.printf("%d ", pop);
            //如果出来的不是应该出来的东西，就报错。
            if (pop != seq[i]) {
                StdOut.println("wrong sequence!");
                return false;
            }
        }

        StdOut.println();
        return true;


    }

    public static void main(String[] args) {
        int[][] a = {{4, 3, 2, 1, 0, 9, 8, 7, 6, 5},
                {4, 6, 8, 7, 5, 3, 2, 9, 0, 1},
                {2, 5, 6, 7, 4, 8, 9, 3, 1, 0},
                {4, 3, 2, 1, 0, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 9, 8, 7, 0},
                {0, 4, 6, 5, 3, 8, 1, 7, 2, 9},
                {1, 4, 7, 9, 8, 6, 5, 3, 0, 2},
                {2, 1, 4, 3, 6, 5, 8, 7, 9, 0}};
        for (int i = 0; i < a.length; i++) {
            StdOut.printf("%d : ", i);

            StdOut.print("    ");
            possibleSequence(a[i]);
        }
    }
}
