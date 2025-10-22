package homework2;

public class TireWide extends Tire{

	public int width;
	public TireWide(String modelName, int maxSpin, int spin, int width) {
		super(modelName, maxSpin, spin);
		this.width = width;
	}
}
