import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int max = 10;
        String[] productNames = new String[max];
        int[] productPrices = new int[max];
        int productCount = 0;

        while (true) {
            System.out.println("1. 상품등록 | 2. 상품 목록 | 3. 종료\n상품 이름을 입력하세요.");
            int menu = scanner.nextInt();
            scanner.nextLine();

            if(menu == 1) {
                if(productCount >= max) {
                    System.out.println("더 이상 상품 등록 불가");
                    continue;
                }
                System.out.print("상품 이름 등록 : ");
                productNames[productCount] = scanner.nextLine();

                System.out.print("상품 가격 등록 : ");
                productPrices[productCount] = scanner.nextInt();

                productCount++;
            } else if (menu == 2) {
                if(productCount == 0) {
                    System.out.println("등록된 상품 없음");
                    continue;
                }
                for(int i = 0; i < productCount; i++) {
                    System.out.println(productNames[i] + " : " + productPrices[i]);
                }
            } else if (menu == 3) {
                System.out.println("프로그램 종료");
                break;
            }
        }
    }
}