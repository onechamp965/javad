package exam2032;

public class ClickableExample {

	public static void main(String[] args) {
		Clickable c1 = new Image("a.jpg");
		Clickable c2 = new Button("");
		
		c1.click();
		c2.click();
		
		Drawable d1 = (Image) c1;
		Drawable d2 = (Button) c2;
		
		d1.draw();
		d2.draw();
	}
}
