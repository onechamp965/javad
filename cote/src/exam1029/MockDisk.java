package exam1029;

public class  MockDisk implements Usb{

	@Override
	public String read() {
		return "OK";
	}

	@Override
	public void write(String data) {
		
	}
	
}
