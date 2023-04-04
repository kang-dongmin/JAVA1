package chap03;
/**
 * 3/21
 * @author 동민
 *
 */
public class ArithmeticEx1 {		//클래스 이름은 대문자로 시작

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5,b=2;
		int sum=a+b;
		int mod=a%b;
		int c=++a;
		int d=b++;
		
		System.out.println("a+b = "+sum);
		System.out.println("a%b = "+mod);
		System.out.println("a 전위 증가 연산 = "+c);
		System.out.println("a 변수의 값 = "+a);
		System.out.println("b 후위 증가 연산 = "+d);
		System.out.println("b 변수의 값 = "+b);
		
	}

}
