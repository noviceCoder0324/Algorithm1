import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

public class Stack<Item> implements Iterable<Item> {
    private Node first;
    private int N;

    private class Node {
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return N;
    }

    public void push(Item item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        N++;
    }

    public Item pop() {
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }

    public Item peek() {
        return first.item;
    }

    public Iterator<Item> iterator() {
        return new StackIterator();
    }

    private class StackIterator implements Iterator<Item> {

        private Node p = first;

        public boolean hasNext() {
            return p != null;
        }

        public Item next() {
            Item temp = p.item;
            p = p.next;
            return temp;
        }
    }

    public static void main(String[] args) {

        Stack<String>[] a = (Stack<String>[]) new Object[10];

        Stack<String> s = new Stack<String>();

        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) {
                s.push(item);
            } else if (!s.isEmpty()) {
                StdOut.print(s.pop() + " ");
            }
        }

        StdOut.println("(" + s.size() + " left on stack)");
    }
}
