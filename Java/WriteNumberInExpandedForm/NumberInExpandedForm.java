
public class NumberInExpandedForm {

	public static String expandedForm(int num) {
		String strNum = Integer.toString(num);
		String result = "";
		int j = 0;

		for (int i = strNum.length()-1; i >= 0; i--) {
			String splitStr = strNum.substring(i, i+1);
			if (!splitStr.equals("0")) {
				result = Integer.parseInt(splitStr) * (int)Math.pow(10, j) + " + " + result;	
			}
			j++;
		}
		
		if (result.endsWith(" + ")) {
			result = result.substring(0, result.length()-3);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(expandedForm(12));
		System.out.println(expandedForm(42));
		System.out.println(expandedForm(70304));
	}
}
