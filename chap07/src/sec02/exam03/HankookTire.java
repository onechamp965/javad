package sec02.exam03;

public class HankookTire extends Tire {

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	
	@Override
	public boolean roll() {
		++accumulatedRoatation;
		if ( accumulatedRoatation < maxRotation ) {
			System.out.println(location + "Tire 수명: " + (maxRotation-accumulatedRoatation) + "회");
		return true;
		} else {
			System.out.println("***" + location + "HankookTire 펑크 ***");
			return false;
		}
	}

}
