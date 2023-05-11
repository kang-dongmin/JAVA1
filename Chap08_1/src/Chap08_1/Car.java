/**
 * 메소드 선언시 리턴값이 있는 경우 반드시 리턴문을 사용해서 리턴값을 지정해야 한다.
 * Return문 이후의 실행문은 결코 실행되지 않는다.
 * return 값이 없는 메소드의 리턴타입은 void를 사용한다.
 * void로 선언된 메소드에서 return문은 메소드를 강제종료 시키는 역활을 한다
 */
package Chap08_1;

public class Car {
	//field(parameter)
	int gas;
	int speed;
	
	//constructor
	
	//method
	void setGas(int gas)		//return값 없는 메소드 매개값 받아서 gas 필드값 변경	
	{
		this.gas=gas;
	}
	
	boolean isLeftGas() {	//리턴값이 boolean인 메소드
		if (gas==0) {
			System.out.println("no gas");
			return false;	//false return
		}
		System.out.println("has gas");
		return true;
	}
	
	void run() {		//리턴값 없는 메소드 gas값이 0이면 return문으로 메소드 강제 종료
		while(true) {
			if (gas>0) {
				System.out.println("run.(remaining gas : "+gas+")");
				gas-=1;
			}
			else {
				System.out.println("Stop.(reamaining gas : "+gas+")");
				return;	//메소드 실행 종료
			}
		}
	}
	
	int getSpeed() {
		return speed;
	}
	
	void keyTruOn() {
		System.out.println("\nTrun the key");
	}
	
	void run2() {
		for(int i=10;i<=50;i+=10) {
			speed=i;
			System.out.println("run.(speed per hour : "+speed+"km/h)");
		}
	}
}
