import java.util.Iterator;

public class Bag<Item> implements Iterable<Item> {

    private Node first;

    private class Node {
        Item item;
        Node next;
    }

    public void add(Item item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
    }

    public Iterator<Item> iterator() {
        return new Iterator<>() {
            private Node p = first;

            public boolean hasNext() {
                return p != null;
            }

            public Item next() {
                Item item = p.item;
                p = p.next;
                return item;
            }
        };
    }


    public static void main(String[] args) {

    }


}
