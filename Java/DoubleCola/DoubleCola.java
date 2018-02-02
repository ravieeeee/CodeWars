
public class DoubleCola {
    public static String WhoIsNext(String[] names, int n) {
        if (n <= names.length) {
            return names[n-1];
        }

        int cnt = 1;
        int beforeLN = 0;
        while (true) {
            beforeLN += cnt * names.length;
            if (beforeLN < n && beforeLN + (cnt * names.length * 2) > n) {
                break;
            }
            cnt *= 2;
        }
        return names[(n - beforeLN) / (cnt * 2)];
    }
}
