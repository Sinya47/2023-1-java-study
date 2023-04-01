package Java_Study;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.HashSet;

public class Exercise09 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
        System.out.println(numbers); // [1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5] 출력
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 11; i++) {
            set.add(numbers.get(i));
        }
        System.out.println(set);
    }
}