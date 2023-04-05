/**
 * 2023.03.28
 * 강동민
 * 조건문 연습
 */

package Chap04;
import java.util.Scanner;
public class SimpleTest1 {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("input score : ");
		int grade=stdin.nextInt();
		
		if (grade>=90)
			{
			System.out.println("합격");
			System.out.print("합격\n");
			System.out.print("thankyou");
			}
		else {
			System.out.println("non pass");
		}
		
		
		
		
		
		stdin.close();
	}

}
