public class Transaction implements Comparable<Transaction> {

    private final String who;
    private final Date when;
    private final double amount;

    public Transaction(String who, Date when, double amount) {
        this.who = who;
        this.when = when;
        this.amount = amount;
    }


    public String who() {
        return this.who;
    }

    public Date when() {
        return this.when;
    }

    public double amount() {
        return this.amount;
    }

    public String toString() {
        return this.who() + " at " + this.when().toString() + " made a transaction on " + this.amount();
    }

    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null || that.getClass() != this.getClass()) {
            return false;
        }
        Transaction t = (Transaction) that;
        return t.who().equals(this.who()) && t.when() == this.when() && t.amount() == this.amount();
    }

    public int compareTo(Transaction that) {
        double x = this.amount - that.amount;
        if (x > 0) return 1;
        else if (x < 0) return -1;
        else return 0;
    }

    public int hashCode() {
        return (int) this.amount();
    }


    public static void main(String[] args) {

    }
}
