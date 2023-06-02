package Chap10;

public class Cellphone {
	//field
	String model;
	String color;
	
	//묵시적 생성자
	
	//method
	void poweron() {
		System.out.println("power on");
	}
	
	void poweroff() {
		System.out.println("power off");
	}
	
	void bell() {
		System.out.println("ring bell.");
	}
	
	void sendVoice(String message) {
		System.out.println("me : "+message);
	}
	
	void receiVoice(String message) {
		System.out.println("You : "+message);
	}
	
	void hangUp() {
		System.out.println("end call.");
	}

}
