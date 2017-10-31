function friend(friends){
  var result = [];
  for (var i = 0; i < friends.length; i++) {
  	if (friends[i].length == 4) {
  		result.push(friends[i]);
  	}
  }
  return result;
}

console.log(friend(["Ryan", "Kieran", "Mark"]));