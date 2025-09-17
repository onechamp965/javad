package sec04.exam05;

public class Car {
	int speed;
	
	int getSpped() {
		return speed;
	}
	
	void KeyTurnOn() {
		System.out.println("키를 돌립니다.");
	}
	
	void run() {
		for ( int i = 10; i <= 50; i++ ) {
			speed = i;
			System.out.println("달립니다. (시속: " + speed + "km/h)");
		}
	}
}
