def order(sentence):
	sentence = sentence.split(' ')
	result = []
	for i in range(1,10):
		for s in sentence:
			if str(i) in s:
				result.append(s)
	return ' '.join(result)
