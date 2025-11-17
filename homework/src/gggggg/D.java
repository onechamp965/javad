package gggggg;

interface Device {
	void powerOn();
	void powerOff();
	void connectNetwork();
}

interface NetworkDevice extends Device {
	void connectNetwork();
}

class SmartPhone implements NetworkDevice {
	public void powerOn() {
		System.out.println("스마트폰 전원 켜짐");
		
	}
	
	public void powerOff() {
		System.out.println("스마트폰 전원 짐");
		
	}
	
	public void connectNetwork() {
		System.out.println("LTE 네트워크에 연결합니다");
	}
	
	public void runApp(String appName) {
		System.out.println(appName + "앱을 실행합니다");
	}
}