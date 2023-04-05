/**
 * 2023.04.04
 * 입력받은 숫자만큼 줄수를 반복하면서 직각삼각형 출력
 * #문제분석
 * 	-변수 : num, i,j
 * #알고리즘 : 
 * 	1. 줄수 입력(num)
 * 	2. 중첩 반복문
 * 		while (i<=num)	//줄 반복
 * 			{
 * 				while(j<=i) 	//별 찍기 반복
 * 					print '*'
 *			}
 */

package Chap05;
import java.util.Scanner;
public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdin=new Scanner(System.in);
		
		System.out.print("input num : ");
		int num=stdin.nextInt();
		
		int i=1,j=1;
		while (i<=num) {
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			i++;
			j=1;
			System.out.println();
		}
		stdin.close();
		
	}

}
