function iqTest(numbers){
	var nArray = numbers.split(" ");
	var oddC = 0; var evenC = 0;
	for (let i = 0; i < nArray.length; i++) {
		nArray[i] % 2 == 0 ? evenC++ : oddC++;
	}
	return evenC == 1 ? 
	nArray.indexOf(nArray.find(x => x%2 == 0))+1 : nArray.indexOf(nArray.find(x => x%2 == 1))+1;
}