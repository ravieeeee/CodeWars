function likes(names) {
	var result = "likes this";
	switch (names.length) {
		case 0 :
			result = "no one " + result;
			break;
		case 1 :
			result = names[0] + " " + result;
			break;
		case 2 :
			result = names[0] + " and " + names[1] + " " + result.replace("likes","like");
			break;
		case 3 :
			result = names[0] + ", " + names[1] + " and " + names[2] + " " + result.replace("likes","like");
			break;
		default :
			result = names[0] + ", " + names[1] + " and " + (names.length-2) + " others " + result.replace("likes","like");
			break;
	}
	return result;
}