function isIsogram(str) {
	for (var i = 0; i < str.length-1; i++) {
		if (str.toLowerCase().includes(str.charAt(i),i+1)) {
			return false;
		}
	}
	return true;
}
