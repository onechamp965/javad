package exam1029;

public class PCExample {

	public static void main(String[] args) {
		PC pc = new PC();
		
		Usb u1 = new SonDisk(8);
		Usb u2 = new SonDisk(32);d
		
		pc.port1 = u1;
		pc.port2 = u2;
		
		pc.test();

	}

}
