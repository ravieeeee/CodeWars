function digitize(n) {
	var result = [];
	n = n.toString();
	for (var i = n.length-1; i >= 0; i--) {
		result.push(parseInt(n.slice(i,i+1)));
	}
	return result;
}
