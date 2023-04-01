package Java_Study;

import java.util.HashMap;

public class Exercise01 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        int average = 0;
        map.put("국어", 80);
        map.put("영어", 75);
        map.put("수학", 55);
        average = (map.get("국어") + map.get("수학") + map.get("영어")) / 3;
        System.out.println("평균은: " + average + "점");

    }
}
