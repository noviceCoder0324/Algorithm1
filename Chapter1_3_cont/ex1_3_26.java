public class ex1_3_26 {

    public static class Node {
        String key;
        Node next;

        public Node(String s) {
            this(s, null);
        }

        public Node(String s, Node n) {
            this.key = s;
            this.next = n;
        }

        public Node append(String s) {
            Node n = new Node(s);
            this.next = n;
            return n;
        }

    }

    public static class _LinkedList {
        Node first;

        public void insertAtFirst(String s) {
            Node oldFirst = first;
            first = new Node(s);
            first.next = oldFirst;
        }

        public void print() {
            Node p = first;
            if (p == null) {
                System.out.print("empty list");
            } else {
                for (; p != null; p = p.next) {
                    System.out.print(p.key + "\t");
                }
            }
        }

    }

    //ex1_3_26
    public static void remove(_LinkedList list, String s) {
        if (list == null) {
            return;
        }
        //skip the beginning part of the linklist if it is equal
        Node p = list.first;
        while (p != null && p.key.equals(s)) {
            p = p.next;
        }
        list.first = p;
        //take care the rest of the linklist
        if (p == null) {
            return;
        }
        while (p.next != null) {
            if (p.next.key.equals(s)) {
                p.next = p.next.next;
            } else {
                p = p.next;
            }
        }

    }

    public static void main(String[] args) {

        _LinkedList list = new _LinkedList();
        list.insertAtFirst("a");
        list.insertAtFirst("b");
        list.insertAtFirst("c");
        list.insertAtFirst("d");
        list.insertAtFirst("c");

        list.print(); // c d c b a

        System.out.println();
        remove(list, "c");
        list.print(); // d b a
    }
}
