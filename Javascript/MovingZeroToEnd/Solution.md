	var moveZeros = function (arr) {
	  return arr.filter(function(x) {return x !== 0}).concat(arr.filter(function(x) {return x === 0;}));
	}
> 자동 형변환 막는 !==, ===
> filter에 함수 전달 가능하다.