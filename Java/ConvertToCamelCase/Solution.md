	static String toCamelCase(String s){
	    Matcher m = Pattern.compile("[_|-](\\w)").matcher(s);
	    StringBuffer sb = new StringBuffer();
	    while (m.find()) {
	        m.appendReplacement(sb, m.group(1).toUpperCase());
	    }
	    return m.appendTail(sb).toString();
	}
>String 객체 : 한번 생성되면 할당된 메모리 공간 변화 없음.(immutable) +연산자 쓰면 문자열이 뒤에 붙는게 아니라, 새 String 객체를 생성후 그 객체 참조. (concatenation이 많으면 성능이 별로)
StringBuilder, StringBuffer : mutable
StringBuilder : synchronization 보장 안함.(단일 스레드)
StringBuffer : synchronization 보장.(멀티 스레드)
(java 5에서 String으로 선언해도 컴파일시 StringBuilder로 컴파일하도록 변경됨.)
