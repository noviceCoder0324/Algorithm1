public class ex1_3_19 {

    public class Node {
        int value;
        Node next;

        public Node(int x) {
            this.value = x;
            this.next = null;
        }
    }

    private Node first;
    private Node

    public ex1_3_19() {
        first = new Node(-999);
    }

    public void add(int x) {
        if (first.next == null) {
            first.next = new Node(x);
        } else {
            Node p = getLast(first.next);
            p.next = new Node(x);
        }
    }

    private Node getLast(Node node) {
        if (node.next == null) {
            return node;
        } else {
            return getLast(node.next);
        }
    }


    public static void main(String[] args) {

        ex1_3_19 first = new ex1_3_19();
        first.add(1);
        first.add(2);
        first.add(3);

        System.out.print(first.first.value);


    }
}
