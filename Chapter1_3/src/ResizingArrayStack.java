import java.util.Iterator;

public class ResizingArrayStack<Item> implements Iterable<Item> {

    private Item[] a = (Item[]) new Object[1];
    private int N = 0;

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void push(Item item) {
        if (N == a.length) {
            resize(2 * a.length);
            a[N++] = item;
        }
    }

    private void resize(int k) {
        Item[] temp = (Item[]) new Object[k];
        for (int i = 0; i < N; i++) {
            temp[i] = a[i];
        }
        a = temp;
    }

    public Item pop() {
        Item item = a[--N];
        a[N] = null;
        if (N > 0 && N == a.length / 4) {
            resize(a.length / 2);
        }
        return item;
    }

    //这个是iterable必备的部分，需要return一个iterator
    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    //iterator怎么来呢？就是要通过内部class，做出hasNext和next来，就可以了。
    private class ReverseArrayIterator implements Iterator<Item> {
        private int i = N;

        public boolean hasNext() {
            return i > 0;
        }

        public Item next() {
            return a[--i];
        }


    }


}
