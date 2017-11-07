function isPrime(num) {
	if (num > 1) {
		for (let i = num - 1; i > 1; i--) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	return false;
}