function rot13(message){
	var arr1 = ["a","b","c","d","e","f","g","h","i","j","k","l","m"];
	var arr2 = ["n","o","p","q","r","s","t","u","v","w","x","y","z"];
	var iChars = ".~`!#$%^&*+=-[]\\\';,/{}|\":<>?";

	var result = "";
	var flag = 0;
	for (var i = 0; i < message.length; i++) {
		var beforeCipher = message.charAt(i);
		for (var j = 0; j < arr1.length; j++) {
			// 숫자 거르기
			if (!isNaN(beforeCipher)) {
				result += beforeCipher;
				break;
			} else {
				if (beforeCipher == iChars.charAt(j)) {
					result += beforeCipher;
					flag = 0;
					break;
				} else {
					if (beforeCipher == beforeCipher.toUpperCase()) {
						beforeCipher = beforeCipher.toLowerCase();
						flag = 1;
					}
					if (beforeCipher == arr1[j]) {
						if (flag) {
							result += arr2[j].toUpperCase();
							flag = 0;
						} else {
							result += arr2[j];					
						}
						break;
					}
					if (beforeCipher == arr2[j]) {
						if (flag) {
							result += arr1[j].toUpperCase();
							flag = 0;
						} else {
							result += arr1[j];					
						}
						break;
					}

				}

				
			}
		}
	}
	return result;
}