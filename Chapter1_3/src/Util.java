public class Util {

    public static String[] toStringArray(String str) {
        int N = str.length();
        String[] res = new String[N];
        char[] chars = str.toCharArray();
        for (int i = 0; i < N; i++) {
            res[i] = String.valueOf(chars[i]);
        }
        return res;

    }

    public static void main(String[] args) {

    }
}
