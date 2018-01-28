	def increment_string(strng):
	    head = strng.rstrip('0123456789')
	    tail = strng[len(head):]
	    if tail == "": return strng+"1"
	    return head + str(int(tail) + 1).zfill(len(tail))
>좋은 함수를 모르면 손과 머리가 고생한다.....