package wonderofu;

public class Side extends Menu {
    private boolean isSpicy;

    public Side() {}

    public Side(String name, int price, boolean isSpicy) {
        super(name, price);
        this.isSpicy = isSpicy;
    }

    public boolean isSpicy() { return isSpicy; }
    public void setSpicy(boolean isSpicy) { this.isSpicy = isSpicy; }

    @Override
    public void displayInfo() {
        System.out.println("사이드: " + name + (isSpicy ? " (매움)" : "") + " - " + price + "원");
    }
}
