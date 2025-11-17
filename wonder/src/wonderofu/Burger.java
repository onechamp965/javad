package wonderofu;

public class Burger extends Menu {
    private String type;

    public Burger() {}

    public Burger(String name, int price, String type) {
        super(name, price);
        this.type = type;
    }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    @Override
    public void displayInfo() {
        System.out.println("버거: " + name + " (" + type + ") - " + price + "원");
    }
}
