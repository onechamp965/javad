package wonderofu;

public class CardPayment implements PaymentMethod {
    private String cardNumber;
    private String cardHolder;

    public CardPayment(String cardNumber, String cardHolder) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    @Override
    public boolean pay(int amount) {
        System.out.println("카드 결제 완료: " + amount + "원 결제됨 (카드: " + cardNumber + ")");
        return true;
    }
}
