package Chap08_1;

public class Sample_2 {

	public static void main(String[] args) {
		System.out.println("매개 변수로 받은 두 수의 합 : "+(args[0]+", "+args[1]));	//매개변수 값 직접 더하기
		
		int num1=Integer.parseInt(args[0]);		//문자열 -> 정수 변환
		int num2=Integer.parseInt(args[1]);
		
		System.out.println("sum is "+(num1+num2));
		

	}

}
