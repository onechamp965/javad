package exam2032;

public class ClickableExample {

	public static void main(String[] args) {
		Clickable c1 = new Image("a.jpg");
		Clickable c2 = new Button("Ok");
		
		c1.click();
		c2.click();
		
		Image i;
		if (c1 instanceof Image)
			i = (Image) c1;

	}

}
