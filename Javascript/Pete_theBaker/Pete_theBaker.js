function cakes(recipe, available) {
	var cake = [];
	
	for (let ingredient in recipe) {
		if (!available.hasOwnProperty(ingredient) || recipe[ingredient] > available[ingredient]) {
			return 0;
		}
		cake.push(parseInt(available[ingredient] / recipe[ingredient]));
	}

	return Math.min(...cake);
}