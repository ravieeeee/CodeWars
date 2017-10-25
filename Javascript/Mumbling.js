function accum(s) {
	var result = "";
	for (var i = 0; i < s.length; i++) {
		result += s.charAt(i).toUpperCase();
		for (var j = 0; j < i; j++) {
			result += s.charAt(i).toLowerCase();
		}
		result += "-";
	}
	return result.substring(0,result.length-1);
}