	function pigIt(str){
	  return str.split(' ').map(function(el){
	    return el.slice(1) + el.slice(0,1) + 'ay';
	  }).join(' ');
	}
>slice에 인자 하나주면 거기부터 끝까지 짜른다 map 최고