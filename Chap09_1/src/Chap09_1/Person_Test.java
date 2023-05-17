package Chap09_1;

public class Person_Test {

	public static void main(String[] args) {
		Person p1=new Person("1234-56789", "honggildong");		//final은 실행 중 값 변경 불가
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		/*p1.nation="usa";
		p1.ssn="777-7777";*/
		p1.name="kim";
		

	}

}
