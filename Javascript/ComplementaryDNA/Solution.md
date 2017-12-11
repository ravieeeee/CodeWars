	function DNAStrand(dna) {
	  return dna.replace(/./g, function(c) {
	    return DNAStrand.pairs[c]
	  })
	}

	DNAStrand.pairs = {
	  A: 'T',
	  T: 'A',
	  C: 'G',
	  G: 'C',
	}
>str.replace(regexp|substr, newSubstr|function)로, regexp 사용시 The match or matches are replaced with newSubStr or the value returned by the specified function. (구체적인 newSubstr로 대체하거나 func을 정의해서 그 리턴값으로 대체) -> callback 사용해서 JSON에 접근.