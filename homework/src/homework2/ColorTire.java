package homework2;

public class ColorTire extends Tire{
	public String color;
	
	public ColorTire(String modelName, int maxSpin, int spin, String color) {
		super(modelName, maxSpin, spin);
		this.color = color;
	}
}
