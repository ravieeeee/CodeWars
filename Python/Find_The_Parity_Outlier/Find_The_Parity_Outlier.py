def find_outlier(integers):
	oddF, evenF = False, False

	for x in integers:
		if x % 2 == 0:
			oddF = True
		else:
			evenF = True

		if (oddF and evenF):
			if (integers.index(x) == 1 and x % 2 == integers[2] % 2):
				return integers[0]
			else:
				return x
