/*
 *  add, sub, mul, div 클래스 생성
 *  각 클래스의 공통 필드 메소드
 *   - int a,b : 2개의 피연산자
 *   - void setValue(int a, int b) : 피연산자 값 객체 내에 저장
 *   -int calculate() : 클래스 목적에 맞는 연산 실행 후 결과 리턴
 *   
 *   main() method
 *   -add, sub, mul, div 객체 생성
 *   -setvalue,calculate() 호출 후 결과 출력
 *   
 *   실행결과 : 
 *   - 두 정수 연산자 입력 >>5,7*
 *   35
 */

package Test;
import java.util.Scanner;

public class Homework {
	
	public static class Add {
		 private int a, b;
		 public void setValue(int a, int b) {
		     this.a = a;
		     this.b = b;
		 }
		
		 public int calculate() {
		     return a + b;
		 }
	}
	
	public static class Sub {
		private int a,b;
		public void setValue(int a, int b) {
			this.a=a;
			this.b=b;
		}
		
		public int calculate() {
			return a-b;
		}
		
	}
	
	public static class Mul {
		private int a,b;
		public void setValue(int a, int b)
		{
			this.a=a;
			this.b=b;
		}
			
		public int calculate() {
			return a*b;
		}
		
	}
	
	public static class Div {
		private int a,b;
		public void setValue(int a, int b) {
			this.a=a;
			this.b=b;
		}
		public int calculate() {
			return a/b;
		}
	}

	public static void main(String[] args) {
		
		Scanner stdin=new Scanner(System.in);
		
		Add add=new Add();
		Sub sub=new Sub();
		Mul mul=new Mul();
		Div div=new Div();
		
		System.out.print("input : ");
		String str=stdin.next();
		
		int a=Integer.parseInt(str.substring(0,1));
		int b=Integer.parseInt(str.substring(2,3));
		char op=str.charAt(1);
		
		switch(op)
		{
		case '+' :
			add.setValue(a,b);
			System.out.printf("%d %c %d = %d\n",a,op,b,add.calculate());
			break;
			
		case '-' :
			sub.setValue(a,b);
			System.out.printf("%d %c %d = %d\n",a,op,b,sub.calculate());
			break;
			
		case '*' :
			mul.setValue(a,b);
			System.out.printf("%d %c %d = %d\n",a,op,b,mul.calculate());
			break;
			
		case '/' :
			div.setValue(a,b);
			System.out.printf("%d %c %d = %d\n",a,op,b,div.calculate());
			break;
		}	
		
		stdin.close();
		}
	}


