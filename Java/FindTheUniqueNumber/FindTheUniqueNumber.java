public class FindTheUniqueNumber {
    public static double findUniq(double arr[]) {
        double before = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (before != arr[i]) {
                if (i != 1) return arr[i];
                else return (arr[i+1] == before) ? arr[i] : before;
            }
        }
        return 0;
    }
}
