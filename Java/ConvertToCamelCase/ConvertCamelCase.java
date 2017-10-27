
public class ConvertCamelCase {
	static String toCamelCase(String s) {
		String result = "";
		boolean flag = false;
		
		for (int i = 0; i < s.length(); i++) {
			if (s.substring(i,i+1).equals("-") || s.substring(i,i+1).equals("_")) {
				flag = true;
			} else {
				if (flag) {
					result += s.substring(i, i+1).toUpperCase();
					flag = false;	
				} else {
					result += s.substring(i, i+1);
				}
			}
		}
		
		return result;
	}
}
