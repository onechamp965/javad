package exam2032;

public class Image implements Clickable{

	String url;
	public Image() {}
	public Image(String url) {
		this.url = url;
	}	
	
	
	@Override
	public void click() {
		System.out.println("그림이 클릭되었습니다.");
	}
	
}
