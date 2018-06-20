def reverseWords(str):
	str = str.split(' ')
	result = ''
	for i in reversed(range(0, len(str))):
		result += str[i] + ' '
	return result[:-1]

