/**
 * 2023.04.04
 * 강동민
 * 1~100까지의 숫자 중에서 사용자부터 입력 받은 숫자의 배수의 합을 구하라.
 * (while, continue 이용)
 * 
 */

package Chap05;
import java.util.Scanner;
public class ContinueTest {

	public static void main(String[] args) {
		System.out.println("1~100까지의 숫자 중 입력 받은 숫자의 배수의 합을 구하는 프로그램");
		Scanner stdin =new Scanner(System.in);
		System.out.print("input number : ");
		int num=stdin.nextInt();
		int sum=0;
		
		int i=1;
		
		while(i<=100)
		{
			if (i%num==0) {
				sum+=i;		//num의 배수만 더하기
				i++;
			} else {
				i++;
				continue;
			}
		}
		
		//출력
		System.out.println("1~100 sum : "+sum);
		stdin.close();

	}

}
