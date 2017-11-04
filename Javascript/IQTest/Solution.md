	function iqTest(numbers){
	  numbers = numbers.split(" ").map(function(el){return parseInt(el)});
	  
	  var odd = numbers.filter(function(el){ return el % 2 === 1});
	  var even = numbers.filter(function(el){ return el % 2 === 0});
	  
	  return odd.length < even.length ? (numbers.indexOf(odd[0]) + 1) : (numbers.indexOf(even[0]) + 1);
	}
>왜 굳이 parseInt써서 int로 타입을 고정시키지???? 홀짝 체킹할때 자동형변환 이용하면 되자나...
배열 2개 생성보다는 사이즈 작을땐 내꺼 int 2개 생성이 더 나은 거 같긴 한데 크면 클수록 이게 더 나아보이네 굿
filter덕에 for roop 안돌린다는 점에서도 이게 더 깔끔하구 좋구나 filter를 쓰자