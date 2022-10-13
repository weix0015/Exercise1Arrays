import java.util.Arrays;

public class Exercise1Array {
    public static void main(String[] args) {
        int[] values = {2, 5, 4, 6, 8, 10, 4, 5};
        int totA = 0;
        for (int i = 0; i < values.length; i = i + 1) {
            totA = totA + values[i];
        }
        System.out.println(totA);
        System.out.println(Arrays.stream(values).sum());

        // Den tager det første tal og lægger sammen med hver andet tal ( + 2 ) og hver tredje tal ( + 3) tal osv.
        // Fordi længden af er 2 og 3 osv.
        int totB = 0;
        for (int i = 0; i < values.length; i = i + 2) {
            totB = totB + values[i];
        }
        System.out.println(totB);

        // Den tager det første tal og lægger sammen med + 2 og med hver andet tal +2 og hver tredje tal +3 tal osv.
        // Fordi længden af er 2 og 3 osv.
        int totC = 0;
        for (int i = 1; i < values.length; i = i + 2) {
            totC = totC + values[i];
        }
        System.out.println(totC);
    }
}
