import edu.princeton.cs.algs4.StdIn;

public class Percolation {
    private int[] id;

    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n) {
        id = new int[n * n];
    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col) {

    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col) {
        return false;
    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col) {
        return false;
    }

    // returns the number of open sites
    public int numberOfOpenSites() {
        return 0;
    }

    // does the system percolate?
    public boolean percolates() {
        return false;
    }

    // test client (optional)
    public static void main(String[] args) {
        System.out.println("test print");
        String currentWord = StdIn.readString();

    }
}
