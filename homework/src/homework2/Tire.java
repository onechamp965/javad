package homework2;

public class Tire {
	public String modelName;
	public int maxSpin;
	public int spin;
	
	public Tire ( String modelName, int maxSpin, int spin ) {
		this.spin = 0;
		this.maxSpin = maxSpin;
		this.modelName = modelName;
	}
	
	public boolean roll() {
		spin+=1;
		if ( spin > maxSpin) {
			return false;
		}else {
			return true;
		}
		
	}
}
