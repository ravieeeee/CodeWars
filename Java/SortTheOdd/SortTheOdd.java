import java.util.BitSet;
import java.util.Collections;
import java.util.LinkedList;

public class SortTheOdd {
    public static int[] sortArray(int[] array) {
        BitSet evenIsTrue = new BitSet(array.length);
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenIsTrue.set(i);
            } else {
                list.add(array[i]);
            }
        }

        Collections.sort(list);

        int[] result = new int[array.length];
        for (int j = 0; j < array.length; j++) {
            result[j] = (evenIsTrue.get(j)) ? array[j] : list.pop();
        }

        return result;
    }
}

// BitSet안쓰고 그냥 array[j]가 짝수인지 바로 비교했어도 됐었다..!