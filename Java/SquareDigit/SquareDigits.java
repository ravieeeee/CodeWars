
public class SquareDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SquareDigits sd = new SquareDigits();
		sd.squareDigits(9119);
	}
	
	public int squareDigits(int n) {
		String concat = "";
		String ns;
		int ni;
		int concatN;
		
		String str = Integer.toString(n);
		for (int i = 0; i < str.length(); i++) {
			ns = str.substring(i, i+1);
			ni = Integer.parseInt(ns);
			ni *= ni;
			concat += ni;
		}
		concatN = Integer.parseInt(concat);
		
		return concatN;
	}

}
