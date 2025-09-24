package sec01.exam01;

public class DmbCellPhoneExample {
	public static void main(String[] args ) {
		
		DMbCellPhone dmbCellPhone = new DMbCellPhone("자바폰", "검정", 10);
		
		System.out.println("모델: " + dmbCellPhone.model);
		System.out.println("색상: " + dmbCellPhone.color);
		
		System.out.println("채널: " + dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.SendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동인데요.");
		dmbCellPhone.SendVoice("아~ 예 반갑습니다");
		dmbCellPhone.powerOff();
		
		dmbCellPhone.turnOffDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}
}
