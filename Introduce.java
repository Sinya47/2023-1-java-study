package Java_Study;

import java.util.Scanner;

class Car {
    int speed;
    String name;

    public Car() {
    }

}

public class Introduce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        System.out.println("자동차의 갯수를 입력하세요.");
        N = scanner.nextInt();
        Car[] cars = new Car[N];
        int count = 0;
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car();
        }
        while (N > 0) {

            System.out.printf("%d번 째 자동차의 스피드를 입력하세요.\n", count + 1);
            cars[count].speed = scanner.nextInt();
            System.out.printf("%d번 째 자동차의 이름을 입력하세요.\n", count + 1);
            cars[count].name = scanner.next();
            N--;
            count++;
        }
        System.out.println("-----경기 참가자 소개-----");
        for (int i = 0; i < cars.length; i++) {
            System.out.printf("스피드는 %d이고, 이름은 %s입니다.\n", cars[i].speed, cars[i].name);
        }
        scanner.close();
    }
}
