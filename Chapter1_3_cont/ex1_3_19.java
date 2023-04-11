public class ex1_3_19 {

    //ex1_3_19-21
    
    public static class Node {
        int value;
        Node next;
    }

    private Node first;
    private int size = 0;

    public void add(int x) {
        Node oldFirst = first;
        first = new Node();
        first.value = x;
        first.next = oldFirst;
        size++;
    }

    //ex1_3_19
    public void removeLast() {
        if (size == 0) {
            return;
        } else if (size == 1) {
            first = null;
            size = 0;
        } else {
            Node p = first;
            for (; p.next.next != null; p = p.next) {
            }
            p.next = null;
            size--;
        }
    }

    //ex1_3_20
    public void delete(int k) {
        if (k >= size) {
            return;
        } else if (k == 0) {
            first = first.next;
            size--;
        } else {
            Node p = first;
            for (; k > 1; k--) {
                p = p.next;
            }
            p.next = p.next.next;
            size--;
        }
    }

    //ex1_3_21
    public boolean find(int x) {
        Node p = first;
        for (; p != null; p = p.next) {
            if (p.value == x) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ex1_3_19 list = new ex1_3_19();
        list.add(3);
        list.add(2);
        list.add(1);

        System.out.print(list.first.value);
        System.out.print(list.first.next.value);
        System.out.println(list.first.next.next.value);

        list.removeLast();
        System.out.print(list.first.value);
        System.out.println(list.first.next.value);
        //System.out.println(list.first.next.next.value);

        list.add(3);
        list.add(4);
        list.add(5);

        System.out.print(list.first.value);
        System.out.print(list.first.next.value);
        System.out.println(list.first.next.next.value);

        list.delete(2);
        System.out.print(list.first.value);
        System.out.print(list.first.next.value);
        System.out.println(list.first.next.next.value);

        System.out.println(list.find(4));
        System.out.println(list.find(3));
    }
}
