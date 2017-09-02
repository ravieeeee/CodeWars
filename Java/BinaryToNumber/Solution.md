## Best Practice
    import java.util.*;
    import java.util.List;

    public class BinaryArrayToNumber {

        public static int ConvertBinaryArrayToInt(List<Integer> binary) {
    
        String res = "";
    
        for (int i : binary)
                res += i; 
        
        return Integer.parseInt(res, 2);
        }
    }
>String to Integer시, 10진수가 아닌 수 일때 radix 값을 넘겨주면 손쉽다