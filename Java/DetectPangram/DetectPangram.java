import java.util.HashSet;
import java.util.Set;

public class DetectPangram {
    public boolean check(String sentence){
        String match = "[^\uAC00-\uD7A3xfe0-9a-zA-Z\\s]";

        sentence = sentence.toLowerCase();
        sentence = sentence.replaceAll(match, "");
        sentence = sentence.replaceAll(" ", "");

        Set<Character> set = new HashSet<>();
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            set.add(c);
        }
        return (set.size() == 26)? true: false;
    }
}
