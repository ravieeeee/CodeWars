def increment_string(s):
	cnt = 0
	try:
		for i in range(len(s)-1, -1, -1):
			if (int(s[i]) != 9):
				if (cnt == 0):
					new_int = int(s[i]) + 1
					s = s[:len(s)-1] + str(new_int)
 				else:
					s = s[:i] + str(int(s[i])+1) + s[i+1:]
				return s
			else:
				cnt += 1
				s = s[:len(s)-cnt] + "0" + s[len(s)-cnt+1:]
	except:
		if (i == len(s)-1):
			return s + "1"
		else:
			s = s[:i+1] + "1" + s[i+1:]
			return s
	return "1"