package Java_Study;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise07 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));

        System.out.println(String.join(" ", myList)); // [Life, is, too, short] 출력
    }
}