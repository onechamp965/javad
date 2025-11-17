package wonderofu;

public class Drink extends Menu {
    private String size;

    public Drink() {}

    public Drink(String name, int price, String size) {
        super(name, price);
        this.size = size;
    }

    public String getSize() { return size; }
    public void setSize(String size) { this.size = size; }

    @Override
    public void displayInfo() {
        System.out.println("음료: " + name + " (" + size + ") - " + price + "원");
    }
}
