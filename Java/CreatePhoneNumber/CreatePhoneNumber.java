
public class CreatePhoneNumber {
	public static String createPhoneNumber(int[] numbers) {
		String phoneNumber = "(";
		phoneNumber = addNumber(phoneNumber, numbers, 0, 3);
		phoneNumber += ") ";
		phoneNumber = addNumber(phoneNumber, numbers, 3, 6);
		phoneNumber += "-";
		phoneNumber = addNumber(phoneNumber, numbers, 6, numbers.length);
		return phoneNumber;
	}
	
	public static String addNumber(String phoneNumber, int[] numbers, int i, int j) {
		for (; i < j; i++) {
			phoneNumber += Integer.toString(numbers[i]);
		}
		return phoneNumber;
	}
}
