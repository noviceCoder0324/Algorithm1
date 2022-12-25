import edu.princeton.cs.algs4.QuickFindUF;

public class Percolation {

    private QuickFindUF UF;
    private int firstNode;
    private int lastNode;

    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n) {
        UF = new QuickFindUF(n * n + 2);
        firstNode = n * n;
        lastNode = n * n + 1;
        for (int i = 0; i < n; i++) {
            UF.union(firstNode, i);
            UF.union(lastNode, n * (n - 1) + i);
        }
    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col) {

    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col) {

    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col) {

    }

    // returns the number of open sites
    public int numberOfOpenSites() {

    }

    // does the system percolate?
    public boolean percolates() {
        return UF.find(firstNode) == UF.find(lastNode);
    }

    // test client (optional)
    public static void main(String[] args) {

    }
}
