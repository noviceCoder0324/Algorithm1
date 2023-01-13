import edu.princeton.cs.algs4.StdOut;

public class ex1_2_6 {

    public static boolean isCircularRotation(String a, String b) {

        // my way, stupid!
        for (int i = 0; i < a.length(); i++) {
            if (b.contains(a.substring(0, i)) && (b.contains(a.substring(i, a.length())))) {
                return true;
            }
        }
        return false;

    }

    public static boolean isCircularRotationSimple(String a, String b) {
        return a.length() == b.length() && (a + a).contains(b);
    }

    public static void main(String[] args) {
        boolean x = isCircularRotationSimple("ACTGACG", "TGACGAC");
        StdOut.println(x);//true

        boolean y = isCircularRotationSimple("ACTGSCG", "THACGAC");
        StdOut.println(y);//false
    }
}
