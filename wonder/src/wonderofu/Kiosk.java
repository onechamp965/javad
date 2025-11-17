package wonderofu;

import java.util.*;

public class Kiosk {
    private Scanner scanner = new Scanner(System.in);
    private Order order = new Order();

    private List<Menu> menuList = new ArrayList<>();

    public Kiosk() {
        menuList.add(new Burger("불고기버거", 5000, "Regular"));
        menuList.add(new Burger("새우버거", 5500, "Regular"));
        menuList.add(new Drink("콜라", 2000, "Medium"));
        menuList.add(new Drink("사이다", 2000, "Medium"));
        menuList.add(new Side("감자튀김", 1500, false));
        menuList.add(new Side("치킨너겟", 2500, true));
    }

    public void start() {
        System.out.println("===== 롯데리아 키오스크 =====");
        boolean running = true;
        while(running) {
            showMainMenu();
            int choice = scanner.nextInt();
            switch(choice) {
                case 1 -> selectMenu();
                case 2 -> {
                    proceedPayment();
                    running = false;
                }
                case 3 -> {
                    System.out.println("프로그램 종료");
                    running = false;
                }
                default -> System.out.println("잘못된 입력입니다.");
            }
        }
    }

    private void showMainMenu() {
        System.out.println("1. 메뉴 선택");
        System.out.println("2. 결제");
        System.out.println("3. 종료");
        System.out.print("선택: ");
    }

    private void selectMenu() {
        System.out.println("===== 메뉴 목록 =====");
        for(int i=0; i<menuList.size(); i++) {
            System.out.print((i+1) + ". ");
            menuList.get(i).displayInfo();
        }
        System.out.print("선택할 메뉴 번호: ");
        int choice = scanner.nextInt() - 1;
        if(choice >= 0 && choice < menuList.size()) {
            order.addMenu(menuList.get(choice));
            System.out.println("메뉴가 추가되었습니다.");
        } else {
            System.out.println("잘못된 번호입니다.");
        }
    }

    private void proceedPayment() {
        order.printReceipt();
        System.out.println("결제 방법 선택: 1. 카드  2. 현금");
        int choice = scanner.nextInt();
        PaymentMethod payment;
        if(choice == 1) {
            scanner.nextLine();
            System.out.print("카드 번호: ");
            String num = scanner.nextLine();
            System.out.print("카드 소유주: ");
            String name = scanner.nextLine();
            payment = new CardPayment(num, name);
        } else {
            payment = new CashPayment();
        }
        payment.pay(order.getTotalPrice());
        System.out.println("주문이 완료되었습니다!");
    }
}
