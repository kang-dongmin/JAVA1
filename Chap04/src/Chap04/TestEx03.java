/**
 * 2023.03.28
 * 강동민
 * 입력된 숫자가 양수, 0, 음수인지 판별하는 프로그램 작성
 */
package Chap04;

import java.util.Scanner;
public class TestEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdin=new Scanner(System.in);
		
		System.out.print("input number : ");
		int num=stdin.nextInt();
		
		if (num>0)
			System.out.println("positive");
		else if (num==0)
			System.out.println("0");
		else 
			System.out.println("negative");
		
		stdin.close();
	}
}
