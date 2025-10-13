package sec02.exam03;

public class KumhoTire extends Tire{

	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRoatation;
		if ( accumulatedRoatation < maxRotation ) {
			System.out.println(location + "Tire 수명: " + (maxRotation-accumulatedRoatation) + "회");
		return true;
		} else {
			System.out.println("***" + location + "KumhoTire 펑크 ***");
			return false;
		}
	}

}
