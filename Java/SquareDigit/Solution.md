## Best Practice
    public class SquareDigit {
      public int squareDigits(int n) {
        String result = ""; 
    
        while (n != 0) {
          int digit = n % 10 ;
          result = digit*digit + result ;
          n /= 10 ;
        }
        return Integer.parseInt(result) ;
      }
    }

>modulo division으로 간결하게 쓰고, 읽기도 쉽다.내껀 String to Integer, Integer to String을 넘 왔다리갔다리해서 변수가 많아졌다.
연산자를 이용하는 방법도 염두에 두자.