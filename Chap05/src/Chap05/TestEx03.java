/**
 * 2023-03-28
 * 1~1000까지의 정수 중에서 사용자가 입력한 숫자의 배수만을 더하여 출력하는 프로그램
 * for으로 작성
 */
package Chap05;
import java.util.Scanner;
public class TestEx03 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("input int : ");
		int num=stdin.nextInt();
		
		int sum=0;
		for(int i=0;i<=1000;i++)
		{
			if (i%num==0)
			{
				sum+=i;
			}
		}
		System.out.printf("\nsum : %d\n",sum);
		
		stdin.close();
		
	}

}
