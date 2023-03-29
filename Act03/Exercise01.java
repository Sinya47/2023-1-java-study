package Act03;

import java.util.HashMap;

public class Exercise01 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("국어", 80);
        map.put("영어", 75);
        map.put("수학", 55);
        int sum = map.get("국어") + map.get("영어") + map.get("수학");
        int average = sum / 3;
        System.out.println(average);
        System.out.println("Test");
    }
}