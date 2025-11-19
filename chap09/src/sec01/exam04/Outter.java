package sec01.exam04;

public class Outter {
	public void method2(int arg) {
		int localVariable = 1;
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}
