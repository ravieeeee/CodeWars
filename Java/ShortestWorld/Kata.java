import java.util.Arrays;

public class Kata {
	public static int findShort(String s) {
		int len = Integer.MAX_VALUE;
		
		for (String str : s.split(" ")) {
			if (len > str.length()) {
				len = str.length();
			}
		}
		return len;
	}
}
