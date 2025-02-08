package list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void displayItems() {
        System.out.println("상품 출력");
        for (Item item : items) {
            System.out.println("상품명 : " + item.getName() + ", 합계 : " +
                    item.getTotalPrice());
        }
        System.out.println("상품 총 가격 : " + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int a = 0;
        for (Item item : items) {
            a += item.getTotalPrice();
        }
        return a;
    }
}
