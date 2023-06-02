/*
 * 여러 개의 부모클래스 상속 안됨 - extends 뒤에는 단 하나의 부모 클래스만.
 * private 접근 제한을 갖는 필드와 메소드는 상속 대상에서 제외
 */

package Chap10;

public class DmbCellphone extends Cellphone {
	
	//field
	int channel;
	
	//constructor
	DmbCellphone(String model, String color, int channel) {
		this.model=model;	//상속받은 필드
		this.color=color;	//상속받은 필드
		this.channel=channel;
	}
	
	//method
	void turnOnDmb() {
		System.out.println("channel "+channel + "DMB Start receivier broadcasts.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel=channel;
		System.out.println("channel "+channel+" change.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB End of broadcast reception");
	}

}
