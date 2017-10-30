	function XO(str) {
	  let x = str.match(/x/gi);
	  let o = str.match(/o/gi);
	  return (x && x.length) === (o && o.length);
	}
> g modifier: global. All matches (don't return on first match)

> i modifier: insensitive. Case insensitive match (ignores case of [a-zA-Z])
