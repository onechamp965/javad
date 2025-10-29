package exam30333;

public class Button implements Drawable{
	public String label;
	public Button() {}
	public Button(String label) {
		this.label = label;
	}	
	
	@Override
	public void draw() {
		if ( label != null)
			System.out.println("버튼이 클릭되었습니다.");
	}

}
