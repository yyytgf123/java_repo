//public class Method2 {
//    public static void main(String[] args) {
//        int balance = 10000;
//
//        int depositAmount = 1000;
//        balance += depositAmount;
//        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액 : " + balance + "원");
//
//        int withrawAmount = 2000;
//        if (balance >= withrawAmount) {
//            balance -= withrawAmount;
//            System.out.println(withrawAmount + "원을 출금하였습니다. 현재 잔액 : " + balance + "원");
//        } else {
//            System.out.println(withrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
//        }
//
//        System.out.println("최종 잔액 : " + balance + "원");
//    }
//}

public class Method2 {
    public static void main(String[] args) {
        System.out.println(depositAmount(10000, 2000));
        System.out.println(withdrawAmount(8000,5000));
        System.out.println(withdrawAmount(5000, 7000));
    }

    public static int depositAmount(int balance, int deposit) {
        balance += deposit;
        return balance;
    }

    public static String withdrawAmount(int balance, int withdraw) {
        if (balance >= withdraw) {
            balance -= withdraw;
            return Integer.toString(balance);
        } else {
            String a = "잔액 부족";
            return a;
        }
    }
}