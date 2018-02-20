	public class PangramChecker {
	  public boolean check(String sentence){
	        for (char c = 'a'; c<='z'; c++)
	            if (!sentence.toLowerCase().contains("" + c))
	                return false;
	        return true;
	  }
	}
>알파벳 순으로 loop를 돌릴수있다..!