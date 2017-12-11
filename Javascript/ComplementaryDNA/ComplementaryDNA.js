function DNAStrand(dna){
	var result = "";

	for (let i = 0; i < dna.length; i++) {
		result += findReverse(dna.substr(i, 1));
	}
	
	return result;
}

function findReverse(dnaSymbol) {
	switch (dnaSymbol) {
		case 'A':
			return 'T';
		case 'T':
			return 'A';
		case 'G':
			return 'C';
		case 'C':
			return 'G';
	}
}