import java.util.LinkedList;
import java.util.List;

public class HowManyNumbers3 {
    public static List<Long> findAll(final int sumDigits, final int numDigits) {
        LinkedList<Long> list = new LinkedList<>();
        Long cnt = 0L, tmp = 0L;

        for (double i = Math.pow(10, numDigits - 1); i < Math.pow(10, numDigits); i++) {
            String s = String.valueOf((int) i);
            int sum = 0;
            String before = "";
            Boolean flag = true;

            for (int j = 0; j < numDigits; j++) {
                String str = s.substring(j, j+1);
                if (!isValid(before, str)) {
                    flag = false;
                    break;
                }
                sum += Integer.valueOf(str);
                before = str;
            }
            if (sum == sumDigits && flag) {
                tmp = Long.valueOf(s);
                if (list.size() == 0) list.add(tmp);
                cnt++;
            }
        }

        list.addFirst(cnt);
        if (cnt == 0) return new LinkedList<>();
        list.add(tmp);
        return list;
    }

    static boolean isValid(String bef, String cur) {
        try {
            if (Integer.valueOf(bef) > Integer.valueOf(cur)) return false;
        } catch (NumberFormatException e) {
            return true;
        }
        return true;
    }
}
