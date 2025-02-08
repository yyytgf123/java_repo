package anonymous.ex;

import java.util.Random;

public class Ex1Main {
    public static void helloDice(Process process) {
        System.out.println("프로그램 시작");
        process.run();
        System.out.println("프로그램 종료");
    }

    static class Dice implements Process {

        @Override
        public void run() {
            int Randon = new Random().nextInt(6);
            System.out.println("주사위 : " + Randon);
        }
    }

    public static void main(String[] args) {
        Process dice = new Dice();
        helloDice(dice);

    }
}
