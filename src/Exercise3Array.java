import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise3Array {
    public static void main(String[] args) {
        // Sort a List with Comparator.naturalOrder
        //List<String> list = Arrays.asList("Jonas", "Tina", "Tom", "Steve", "Amanda", "Hanna", "Rebecca", "Carl");
        //List<String> sortedList = list.stream().sorted().collect(Collectors.toList());
        //sortedList.forEach(System.out::println);
        Exercise3ArrayPart2();
    }
    public static void Exercise3ArrayPart2() {
        List<String> list = Arrays.asList("Jonas", "Tina", "Tom", "Steve", "Amanda", "Hanna", "Rebecca", "Carl");
        List<String> sortedList = list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        sortedList.forEach(System.out::println);
    }
}
