	function countBits(n) {
	  for(c=0;n;n>>=1)c+=n&1
	  return c;
	}
>오오 비트연산