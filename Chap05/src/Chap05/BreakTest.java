/**
 * 2023.04.04
 * 강동민
 * 숫자를 반복적으로 입력 받아서 정수의 합이 1000 이상이 되면 1000을 넘은 수와 평균을 출력
 * 
 * #문제 분석
 * 	-변수 : cnt;
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
		double avg;
		
		while(true)
		{
			System.out.print("input number : ");
			int num=stdin.nextInt();
			sum+=num;
			System.out.println("sum : "+sum);
			
			cnt++;
			if(sum>=1000) {
				System.out.println("\n100을 넘은 수 : "+num);
				break;
			}
			
		}
		
		avg=sum/cnt;
		System.out.println("average : "+avg);
		stdin.close();

	}

}
