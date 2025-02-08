import java.util.Scanner;

public class Method4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bank = 0;

        while(true) {
            System.out.println("---------------------------------------");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
            System.out.println("---------------------------------------");
            System.out.print("선택 : ");
            int choice = scanner.nextInt();

            if(choice == 1) {
                System.out.print("입금액을 입력하세요 : ");
                int depo = scanner.nextInt();
                bank = deposit(bank, depo);
                continue;
            } else if (choice == 2) {
                System.out.print("출금액을 입력하세요 : ");
                int withd = scanner.nextInt();
                bank = withdraw(bank, withd);
                continue;
            } else if (choice == 3) {
                System.out.print("현재 잔액 : ");
                balance(bank);
                continue;
            } else if (choice == 4) {
                break;
            }
        }
    }

    public static int deposit(int balance, int amount) {
        balance += amount;
        return balance;
    }

    public static int withdraw(int balance, int amount) {
        if (balance < amount){
            System.out.println("잔액 부족");
        } else {
            balance -= amount;
        }
        return balance;
    }

    public static void balance(int balnace) {
        System.out.println(balnace);
    }
}
