## Best Practice
    public class Kata {
      public static String createPhoneNumber(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d",numbers[0],numbers[1],numbers[2],numbers[3],numbers[4],numbers[5],numbers[6],numbers[7],numbers[8],numbers[9]);
      }
    }
>C의 printf 같이 표현할 수 있는 메소드가 있었다니