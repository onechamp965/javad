package exam30333;

public class Image implements Drawable{
	String url;
	public Image() {}
	public Image(String url) {
		this.url = url;
	}	
	
	
	@Override
	public void draw() {
		if ( url != null)
			System.out.println("그림이 클릭되었습니다.");
	}
}
