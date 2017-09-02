## Best Practice

	import java.util.Arrays;

	public class Solution {

	    public static int solveSuperMarketQueue(int[] customers, int n) {
	      int[] result = new int[n];
	      for(int i = 0; i < customers.length; i++){
	        result[0] += customers[i];
	        Arrays.sort(result);
	      }
	      return result[n-1];
	    }
	    
	}
    
>이거 보고 나니까 문제가 엄청 단순하게 느껴짐. 무작정 풀려고 달려들지 말고 추상화 할 방법에 대해 생각을 좀 하다가 시작하면 코드가 훨씬 좋아질 거라는 생각