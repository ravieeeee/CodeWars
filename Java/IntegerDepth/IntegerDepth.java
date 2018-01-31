import java.util.HashSet;
import java.util.Set;

public class IntegerDepth {
    static int computeDepth(int n) {
        Set<Character> set = new HashSet<>();
        int depth = 0;
        int multiple = 1;
        while (set.size() < 10) {
            int m = n * multiple;
            String str = String.valueOf(m);
            for (int i = 0; i < str.length(); i++) {
                set.add(str.charAt(i));
            }
            multiple++;
            depth++;
        }
        return depth;
    }
}
