package exam1117;

public class Test {
	private int value;
	
	public void setVaule(int value) {this.value = value;}
	public int getValue() {return value;}
	
	public void merge(Test other) {
		this.value = this.value + other.getValue();
	}

}
