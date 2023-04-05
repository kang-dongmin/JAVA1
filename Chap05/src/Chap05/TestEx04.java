/**
 * 2023.03.28
 * 두 개의 숫자를 입력 받아서 두 숫자 사이의 홀수값을 모두 더하여 출력하는 프로그램 작성
 *a,b 대소는 순서 모름
 *
 *#문제분석
 *	변수 : first, second, sum
 *#알고리즘
 *		1. 정수 입력(first,second)
 *		2. 조건문
 *			if (first<second)
 *
 *		3. 복합논리 (반복문 안에 선택문 포함)
 *			for (first, second, first++)
 *				if( first%2==1)
 *					sum+=first
 */

package Chap05;
import java.util.Scanner;
public class TestEx04 {

	public static void main(String[] args) {
		Scanner stdin= new Scanner(System.in);
		
		System.out.print("input first int : ");
		int first=stdin.nextInt();
		
		System.out.print("input second int : ");
		int second=stdin.nextInt();
		
		int sum=0;
		
		if (first>second)		//first는 second보다 항상 작은 값을 가진다
		{
			int temp=first;
			first=second;
			second=temp;
		}
		
		
		for(int i=first; i<=second; i++)
		{
			if(i%2==1)		//홀수 판별
				sum+=i;
		}
		
		//output
		System.out.printf("\n%d ~ %d odd`s sum: %d",first,second,sum);
		
		stdin.close();

	}

}
