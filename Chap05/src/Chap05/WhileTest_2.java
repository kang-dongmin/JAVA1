/**
 * 2023. 04.04
 * 강동민
 * 입력받은 숫자의 팩토리얼 구하기
 * 
 * #문제분석
 * 	-변수 : fac, facvalue
 * #알고리즘
 * 	1. 정수 입력(fac)
 *  2. 반복문
 *  		while(fac>1)
 *  			{
 *  				fac을 1씩 감소하면서 곱한다
 *  			}
 *  		
 *  		for(fac; 1; fac--)
 *  			facvalue*=fac;
 *  3. 결과 출력
 */

package Chap05;
import java.util.Scanner;
public class WhileTest_2 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("input num : ");
		int fac=stdin.nextInt();
		
		int facvalue=1;
		
		for(int i=fac;i>=1;i--) {
			System.out.print(i+"* ");
			
			facvalue*=i;
		}

		//output
		System.out.println("="+facvalue);
		
		stdin.close();
	}

}
