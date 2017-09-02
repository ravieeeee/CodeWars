## Best Practice
    import java.util.Arrays;

	public class Kata {
    	public static int findShort(String s) {
        		return Arrays.stream(s.split(" ")).mapToInt(String::length).min().getAsInt();
    	}
	}

>이걸로 lambda expression이 왜 간략하게 표현되는지 바로 느끼고 이해도 됐는데 이걸 바로 사용하지는 못 할듯하다. 함수형 프로그래밍이 처음 접할 때 좀 낯선 감이 드는 듯. 