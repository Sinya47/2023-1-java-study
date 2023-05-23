package For_Exam;

import java.util.Random;
import java.util.Scanner;

class Car {
    protected int speed;
    protected String name;
    protected int move;
    protected int second;

    public Car() {
    }

    public Car(int speed, String name) {
        this.speed = speed;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getMove() {
        return move;
    }

    public void setMove(int move) {
        this.move = move;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void go() {
        long seed = System.currentTimeMillis();
        Random random = new Random(seed);
        for (int i = 0; i < second; i++) {
            if (random.nextInt(2) == 1) {
                move += speed;
            }
        }
    }

    public void sayScore() {

        System.out.printf("score: %d\n", move);

    }

}

class SuperCar extends Car {
    private long seed = System.currentTimeMillis();
    private Random random = new Random(seed);
    private Random random2 = new Random(seed);
    private int count;

    public SuperCar(int speed, String name) {
        this.speed = speed;
        this.name = name;
    }

    public void go() {
        for (int i = 0; i < getSecond(); i++) {
            if (random.nextInt(2) == 1) {
                move += speed;
                if (random2.nextInt(2) == 1) {
                    move += speed;
                    count++;
                }
            }
        }
    }

    public void sayScore() {
        System.out.printf("score: %d, booster: %d\n", move, count);
    }

}

public class Week04 {
    public static void main(String[] args) {
        int speed;
        String name;
        int second;
        int isSuper = 0;

        Scanner scanner = new Scanner(System.in);
        int N;
        System.out.println("자동차의 갯수를 입력하세요.");
        N = scanner.nextInt();

        Car[] cars = new Car[N];
        int count = 0;
        for (int i = 0; i < cars.length; i++) {
            System.out.printf("%d번 째 자동차의 스피드를 입력하세요.\n", count + 1);
            speed = scanner.nextInt();
            System.out.printf("%d번 째 자동차의 이름을 입력하세요.\n", count + 1);
            name = scanner.next();
            System.out.println("이 자동차는 슈퍼카인가요? 0 또는 1 입력");
            isSuper = scanner.nextInt();
            if (isSuper == 0)
                cars[i] = new Car(speed, name);
            else if (isSuper == 1)
                cars[i] = new SuperCar(speed, name);

        }

        System.out.println("-----경기 참가자 소개-----");
        for (int i = 0; i < cars.length; i++) {
            System.out.printf("스피드는 %d이고, 이름은 %s입니다.\n", cars[i].getSpeed(), cars[i].getName());
        }
        System.out.println();
        System.out.println("경기를 몇 초 동안 진행할까요?");
        second = scanner.nextInt();

        for (int i = 0; i < cars.length; i++) {
            cars[i].setSecond(second);
            cars[i].go();
        }
        System.out.println();
        System.out.println("---최종 결과 발표---");
        for (int i = 0; i < cars.length; i++) {
            cars[i].sayScore();
        }

        scanner.close();
    }
}
