/**
 * 2023-05-02
 */

package Chap07;

public class PlusMinus {
	int plus,minus;	//필드 - 속성
	
	public  String plus(int x, int y) {	//method,	type이 String인 이유 : return값이 String이라서
		plus=x+y;
		return "두 수의 합은 " +plus;
	}
	
	public String minus(int x, int y) {	//method
		minus =x-y;
		return "두 수의 차는 "+minus;
	}
}
