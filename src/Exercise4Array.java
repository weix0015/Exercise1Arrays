import java.util.Arrays;

public class Exercise4Array {

        public static int findIndex(int arr[], int t) {
            int index = Arrays.binarySearch(arr, t);
            return (index < 0) ? -1 : index;
        }
    public static void main(String[] args) {
            int[] my_array = { 0, 1, 2, 3, 4, 5};
        System.out.println("Index 0: " + findIndex(my_array, 0));
        System.out.println("Index 1: " + findIndex(my_array, 1));
        System.out.println("Index 2: " + findIndex(my_array, 2));
        System.out.println("Index 3: " + findIndex(my_array, 1));
        System.out.println("Index 4: " + findIndex(my_array, 4));
        System.out.println("Index 5: " + findIndex(my_array, 1));
        }
    }
