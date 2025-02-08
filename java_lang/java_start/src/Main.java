import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] scores = new int[4][3];
        String[] subjects = {"국", "영", "수"};

        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + "번 학생의 성적");
            for(int j = 0; j < 3; j++) {
                System.out.print(subjects[j] + " 점수:");
                scores[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < 4; i++) {
            int total = 0;
            for(int j = 0; j <3; j++) {
                total += scores[i][j];
            }
            double avg = total / 3.0;
            System.out.printf(i + "번 학생의 충점: %d, 평균 %.2f\n", total, avg);
        }
        System.out.println();
    }
}