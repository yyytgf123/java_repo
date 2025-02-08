public class Method3 {
    public static void main(String[] args) {
        int balance = 10000;

        balance = deposit(balance, 1000);
        balance = withdraw(balance, 2000);
        balance = withdraw(balance, 9000);

        System.out.println("최종 잔액 : " +  balance);
    }

    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금했습니다. 현재 잔액 : " + balance);
        return balance;
    }

    public static int withdraw(int balance, int amount) {
        if(balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금했습니다. 현재 잔액 : " + balance);
        } else {
            System.out.println(amount + "원을 출금하려 했으나 잔액 부족");
        }
        return balance;
    }
}
