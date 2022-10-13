import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayExercise1 {
    public static void main(String[] args) {
        ArrayList<Integer> integers=new ArrayList<>();
        System.out.println("Enter your 5 Integer  output:");
        Scanner input=new Scanner(System.in);
        for(int i=0;i<5;i++){
            int nummer=input.nextInt();
            if(!integers.contains(nummer));
            integers.add(nummer);
        }
        Collections.sort(integers);
        System.out.println(integers);
    }
}