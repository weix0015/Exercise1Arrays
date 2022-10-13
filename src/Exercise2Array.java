public class Exercise2Array {
    public static void main(String[] args) {
        int[] values = {2, 5, 5, 6, 8, 10, 4, 5};
        int a = 0;
        while (values[a] <= values[a+1]){
            System.out.println(values[a]);
            a = a + 1;
        }
        // Den tager alle tal indtil der er 8 eller mindre hvis det er a + 1, og hvis det er a + 2 så gør den det
        // samme bare med hver andet tal.
    }
}
