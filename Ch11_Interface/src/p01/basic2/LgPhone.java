package p01.basic2;

public class LgPhone implements Phone {

	@Override
	public void sendCall() {
		System.out.println("LG Phone - 따르릉");
	}

	@Override
	public void receiveCall() {
		System.out.println("LG Phone - 전화왔습니다.");
	}
	
	public void flash() {
		System.out.println("LG Phone - 전화기에 불이 켜졌습니다.");
	}

}
