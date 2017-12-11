	function cakes(recipe, available) {
	  return Object.keys(recipe).reduce(function(val, ingredient) {
	    return Math.min(Math.floor(available[ingredient] / recipe[ingredient] || 0), val)
	  }, Infinity)
	}
>arr.reduce(callback[, initialValue])로, Infinity는 initialValue. 무한대 값을 초기 값으로 하고 계속해서 최소값을 찾는 형태.
>Math.floor를 매 ingredient마다 쓸 필요는 없었고(comment), reduce가 accumulator를 토대로 currentValue를 더해가는 것인데 accumulator를 전혀 쓰지 않았고(쓸 일도 없었고) 단지 key 순회만 필요했던 거라면 for loop말고 reduce 쓴 이점이 뭔가(내생각)?? 