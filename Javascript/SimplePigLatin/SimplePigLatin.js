function pigIt(str){
	var voca = str.split(' ');
	var result = '';
	for (let i = 0; i < voca.length; i++) {
		result += voca[i].slice(1,voca[i].length) + voca[i].charAt(0) + 'ay ';
	}
	return result.slice(0,result.length-1);
}