function XO(str) {
	var xCount = 0;
	var oCount = 0;
	for (var i = 0; i < str.length; i++) {
		if (str.charAt(i).toLowerCase() == "x") {
			xCount++;
		} else if (str.charAt(i).toLowerCase() == "o") {
			oCount++;
		}
	}
	return (xCount == oCount);
}