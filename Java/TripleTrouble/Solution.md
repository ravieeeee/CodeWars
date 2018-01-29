    public class Kata {
      public static int TripleDouble(long num1, long num2) {
        String n1str = String.valueOf(num1);
        String n2str = String.valueOf(num2);
        for(int i = 0; i < 10; i++) {
          String n = String.valueOf(i);
          if( n1str.contains(n+n+n) && n2str.contains(n+n) ) return 1;
        }
        return 0;
      }
    }
>그냥 3개가 연속해서 나타나는 모양을 찾으면 됐었다

    public class Kata {
        public static int TripleDouble(long num1, long num2) {
            return hasDuplicates(num1, 3) & hasDuplicates(num2, 2) ? 1 : 0;
        }
        private static boolean hasDuplicates(long num, int count) {
            String valueOfNum = String.valueOf(num);
            int countOfDuplicate = 1;
            for (int i = 1; i < valueOfNum.length(); i++) {
                countOfDuplicate = valueOfNum.charAt(i) == valueOfNum.charAt(i - 1) ? ++countOfDuplicate : 1;
                if (countOfDuplicate == count) {
                    return true;
                }
            }
            return false;
        }
    }
>이전 문자열과 비교