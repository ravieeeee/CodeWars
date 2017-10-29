	function rot13(message) {
	  var a = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
	  var b = "nopqrstuvwxyzabcdefghijklmNOPQRSTUVWXYZABCDEFGHIJKLM"
	  return message.replace(/[a-z]/gi, c => b[a.indexOf(c)])
	}
>와 난 if문 떡칠을 해놨는데ㅠ regex를 한번 봐볼 것. 대충알고있기만 하니까 쓸 생각이 안드는거같음