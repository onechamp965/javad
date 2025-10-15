package exam1015;

public class GogumaPizza extends Pizza{
	
	public GogumaPizza() {
		this("S");
	}
	public GogumaPizza(String size) {
		this.size = size;
		this.name = "고구마 피자";
		prices = new int[] {10000, 15000, 20000};
	}
}
