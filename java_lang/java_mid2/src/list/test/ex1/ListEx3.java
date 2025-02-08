package list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> input = new ArrayList<>();

        int sum = 0;
        while (true) {
            int b = sc.nextInt();
            if (b != 0) {
                input.add(b);
                sum += b;
            } else {
                break;
            }
        }

        System.out.println("입력한 정수의 합계 : " + sum);
        System.out.println("입력한 정수의 평균 : " + sum / input.size());

    }
}
