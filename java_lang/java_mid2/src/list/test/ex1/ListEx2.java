package list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> input = new ArrayList<>();

        while (true) {
            int b = sc.nextInt();
            if (b != 0) {
                input.add(b);
            } else {
                break;
            }
        }
        for (int i = 0; i < input.size(); i++) {
            System.out.print(input.get(i));
            if (input.get(i).equals(input.getLast())) {
                System.out.print("");
            } else {
                System.out.print(", ");
            }
        }
    }
}
