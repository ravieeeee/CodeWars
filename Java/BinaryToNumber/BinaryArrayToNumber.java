import java.util.Collections;
import java.util.List;

public class BinaryArrayToNumber {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
    	int ans = 0;
    	int base = 1;
    	Collections.reverse(binary);
    	for (int num : binary) {
    		if (num == 1) {
    			ans += base;
    		}
    		base *= 2;
    	}
    	return ans;
    }
}