package wonderofu;

public class CashPayment implements PaymentMethod {
    @Override
    public boolean pay(int amount) {
        System.out.println("현금 결제 완료: " + amount + "원 결제됨");
        return true;
    }
}
