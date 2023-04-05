/**
 * 2023. 04.04
 * 강동민
 * 두 숫자를 입력 받아서 두 수 사이의 합계 출력하기
 * # 문제분석
 * 	-변수 : first,second,total
 * # 알고리즘
 * 	1. 정수 입력(first,second)
 * 	2. 선택문 (if (first<second))
 * 	3. 반복문 (for(first; second; first++)
 * 					total+=first;)
 */

package Chap05;
import java.util.Scanner;
public class TestEx05 {
	
	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		
		//input
		System.out.print("fisrt number : ");
		int first=stdin.nextInt();
		System.out.print("secont number : ");
		int second=stdin.nextInt();
		
		int total=0;
		
		//first는 second보다 항상 작은 값을 가진다
		if (first>second) {
			int temp=first;
			first=second;
			second=temp;
		}
		
		for (int i=first;i<=second;i++)
		{
			total+=i;
		}
		
		//output
		System.out.println("total : "+total);
		
		stdin.close();
	}

}
