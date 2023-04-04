/**
 * 2023.03.14
 * 세개의 값을 입력 받아 첫 번째 값은 문장, 두 번째 값은 정수값
 * 세 번째 값은 실수로 출력하는 프로그램
 * @author 동민
 */
package Chap02;
import java.util.Scanner;

public class KeyboardInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn=new Scanner(System.in);
		System.out.print("이름과 나이, 몸무계를 공간(space)으로 구분하여 입력 :");

		String name=stdIn.next(); //이름 문자열로 입력
		int i=stdIn.nextInt(); //나이 정수로 입력
		double d=stdIn.nextDouble(); //몸무계는 실수로 입력
		System.out.println(name+"씨의 나이는 "+i+"세이고 ");
		System.out.print("몸무계는 "+d+"Kg 입니다.");
		stdIn.close();
		
		
	}

}
