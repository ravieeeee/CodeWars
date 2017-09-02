## Best Practice

	public class Vowels {

	    public static int getCount(String str) {
	        return str.replaceAll("(?i)[^aeiou]", "").length();
	    }

	}
    
>정규표현식으로 모음 아닌 문자를 다 없앤다 짱 창의적



