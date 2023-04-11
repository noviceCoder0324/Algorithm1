public class ex1_3_24 {

    //ex1_3_24-25
    public static class Node<T> {
        T value;
        Node<T> next;

        public Node(T v) {
            this(v, null);
        }

        public Node(T v, Node<T> next) {
            this.value = v;
            this.next = next;
        }

        public Node<T> append(T v) {
            Node<T> n = new Node<>(v);
            this.next = n;
            return n;
        }
    }

    public static void print(Node n) {
        if (n == null) {
            System.out.println();
            return;
        }
        System.out.print("\t" + n.value);
        print(n.next);
    }

    public static void main(String[] args) {
        Node<String> first = new Node<>("a");
        first.append("b").append("c").append("d").append("e");

        print(first);//a b c d e
        removeAfter(first.next);
        print(first);//a b d e

        Node<String> second = new Node<>("1");
        second.append("2").append("3");
        

        insertAfter(first, second);
        print(first);// a 1 2 3 b c d e
        print(second);// 1 2 3
    }

    //ex1_3_25
    private static void insertAfter(Node first, Node second) {
        //TODO
        if (first == null || second == null) {
            return;
        }
        //Not very clear.

    }

    //ex1_3_24
    private static void removeAfter(Node n) {
        if (n == null || n.next == null) {
            return;
        }
        n.next = n.next.next;
    }
}
