/**
 * 2023.04.04
 * 강동민
 * 숫자를 반복적으로 입력 받아서 정수의 합이 1000 이상이 되면 1000을 넘은 수와 평균을 출력
 * 
 * #문제 분석
 * 	-변수 :
 * #알고리즘
 * 
 * 
 */

package Chap05;
import java.util.Scanner;
public class BreakTest {

	public static void main(String[] args) {
		
		Scanner stdin=new Scanner(System.in);
		
		//variable
		int cnt=0, sum=0;
		
		
		while(true)
		{
			System.out.print("input number : ");
			int num=stdin.nextInt();
			 
			sum+=num;		//입력받은 값의 합게
			cnt++;		//입력 횟수 증가
			
			System.out.printf("sum : %d\n\n",sum);
			
			if(sum>=1000) {		//합계가 1000이상인지
				System.out.print("---------------------------\n");
				break;		//반복 종료
			}
			
		}
		
		//output
		System.out.printf("sum : %d\naverage : %d\n",sum,sum/cnt);
		stdin.close();

	}

}
