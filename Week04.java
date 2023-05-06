package For_Exam;

import java.util.Random;
import java.util.Scanner;

class Car {
    private int speed;
    private String name;
    private int move;

    public Car() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMove() {
        return move;
    }

    public void setMove(int move) {
        this.move = move;
    }

}

public class Week04 {
    public static void main(String[] args) {
        long seed = System.currentTimeMillis();
        Random random = new Random(seed);
        int speed;
        String name;
        int second;
        int move = 0;

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
            speed = scanner.nextInt();
            cars[count].setSpeed(speed);

            System.out.printf("%d번 째 자동차의 이름을 입력하세요.\n", count + 1);
            name = scanner.next();
            cars[count].setName(name);

            N--;
            count++;
        }
        System.out.println("-----경기 참가자 소개-----");
        for (int i = 0; i < cars.length; i++) {
            System.out.printf("스피드는 %d이고, 이름은 %s입니다.\n", cars[i].getSpeed(), cars[i].getName());
        }
        System.out.println();
        System.out.println("경기를 몇 초 동안 진행할까요?");
        second = scanner.nextInt();

        for (int i = 0; i < cars.length; i++) {
            move = 0;
            for (int j = 0; j < second; j++) {
                if (random.nextInt(2) == 1) {
                    move += cars[i].getSpeed();
                    cars[i].setMove(move);
                }
            }
        }
        System.out.println();
        System.out.println("---최종 결과 발표---");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].getMove());
        }

        scanner.close();
    }
}
