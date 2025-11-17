package wonderofu;

import java.util.*;

public class Order {
    private List<Menu> orderList = new ArrayList<>();
    private int totalPrice = 0;

    public Order() {}

    public Order(List<Menu> orderList) {
        this.orderList = orderList;
        calculateTotal();
    }

    public void addMenu(Menu menu) {
        orderList.add(menu);
        totalPrice += menu.getPrice();
    }

    public void removeMenu(int index) {
        if(index >= 0 && index < orderList.size()) {
            totalPrice -= orderList.get(index).getPrice();
            orderList.remove(index);
        }
    }

    public void calculateTotal() {
        totalPrice = 0;
        for(Menu m : orderList) totalPrice += m.getPrice();
    }

    public int getTotalPrice() { return totalPrice; }

    public void printReceipt() {
        System.out.println("===== 영수증 =====");
        for(Menu m : orderList) {
            m.displayInfo();
        }
        System.out.println("총 금액: " + totalPrice + "원");
        System.out.println("================");
    }

    public List<Menu> getOrderList() { return orderList; }
}
