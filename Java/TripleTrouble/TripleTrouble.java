import java.util.HashSet;
import java.util.Set;

public class TripleTrouble {
    public static int TripleDouble(long num1, long num2) {
        String str1 = Long.toString(num1);
        int cnt1 = countDuplication(str1);
        if (cnt1 < 2) {
            return 0;
        }
        String str2 = Long.toString(num2);
        int cnt2 = countDuplication(str2);
        if (cnt2 < 1) {
            return 0;
        }
        return 1;

    }

    static int countDuplication(String str) {
        int cnt = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char s = str.charAt(i);
            if (set.contains(s)) {
                cnt++;
            }
            set.add(s);
        }
        return cnt;
    }
}
