
public class HighestScoringWord {
    public static String high(String s) {
        String[] words = s.split(" ");
        int[] counts = new int[words.length];
        int cnt = 1;

        for (int i = 0; i < words.length; i++) {
            for (char c = 'a'; c <= 'z'; c++) {
                for (int j = 0; j < words[i].length(); j++) {
                    if (c == words[i].charAt(j)) {
                        counts[i] += cnt;
                    }
                }
                cnt++;
            }
            cnt = 1;
        }

        return words[getMaxIndex(counts)];
    }

    public static int getMaxIndex(int[] inputArray){
        int maxValue = inputArray[0];
        int idx = 0;
        for(int i=1;i < inputArray.length;i++){
            if(inputArray[i] > maxValue){
                maxValue = inputArray[i];
                idx = i;
            }
        }
        return idx;
    }
}
