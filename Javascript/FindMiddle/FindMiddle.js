var gimme = function(inputArray) {
	var bfArray = inputArray.slice(0);
	return bfArray.indexOf(
		inputArray.sort(function(a, b){return a - b})[(inputArray.length-1)/2]);
};
