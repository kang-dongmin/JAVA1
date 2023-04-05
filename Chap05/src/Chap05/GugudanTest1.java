/**
 * 2023.03.28
 * 강동민
 * 입력받은 단의 구구단 출력하기
 */
package Chap05;
import java.util.Scanner;
public class GugudanTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("단 입력 : ");
		int num=stdin.nextInt();
		
		for(int i=1;i<10;i++)		
		{
			System.out.printf("\n%d * %d = %d",num,i,num*i);
		}
		
		stdin.close();
	}
}
