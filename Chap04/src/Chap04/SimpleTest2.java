/**
 * 2023.03.28
 * 강동민
 * 조건문 연습
 */

package Chap04;
import java.util.Scanner;
public class SimpleTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin=new Scanner(System.in);
		
		System.out.print("input score : ");
		int grade=stdin.nextInt();
		
		if (grade>=90)
			System.out.println("A");
		else if (grade>=80)
			System.out.println("B");
		else if(grade>=70)
			System.out.println("C");
		else if (grade>=60)
			System.out.println("D");
		else 
			System.out.println("F");
		
		stdin.close();
		
	}

}
