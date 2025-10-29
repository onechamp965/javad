package exam2032;

public class Button	implements Clickable{
	
	public String label;
	public Button() {}
	public Button(String label) {
		this.label = label;
	}	
	
	@Override
	public void click() {
		System.out.println("버튼이 클릭되었습니다.");
	}
}
