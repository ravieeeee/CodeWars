var moveZeros = function (arr) {
	var findIndex;
	var count = 0;
	while ((findIndex = arr.indexOf(0)) > -1) {
		for (findIndex; findIndex < arr.length-1; findIndex++) {
			arr[findIndex] = arr[findIndex+1];
		}
		arr.pop();
		count++;
	}	

	for (var i = 0; i < count; i++) {
		arr.push(0);
	}

	return arr;
}