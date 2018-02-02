		public class Line {
		  public static String WhoIsNext(String[] names, int n){
		    while ( n > names.length){
		      n = (n - (names.length - 1)) / 2;
		    }
		    return names[n-1];
		  }
		}

>Let's unfold the queue:

		1 2 3 4 5   1 1 2 2 3 3 4 4 5 5   1 1 1 1 2 2 2 2 3 3 3 3 4 4 4 4 5 5 5 5   ...

>We notice that if we do this transformation, we can reduce r while preserving the shape of the queue:

		1 2 3 4 5   1 1 2 2 3 3 4 4 5 5   1 1 1 1 2 2 2 2 3 3 3 3 4 4 4 4 5 5 5 5   ...
		r -= 5 ->
		1 1 2 2 3 3 4 4 5 5   1 1 1 1 2 2 2 2 3 3 3 3 4 4 4 4 5 5 5 5   ...
		r /= 2 -> //Note: this is integer division, so it's   r = floor(r/2)
		1 2 3 4 5    1 1 2 2 3 3 4 4 5 5   ...

>Which gives us a way to reduce r until it's between 1 to 5, which we can directly use as an index.