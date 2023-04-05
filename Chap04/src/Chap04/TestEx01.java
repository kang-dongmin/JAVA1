/**
 * 2023.03.28
 * 강동민
 * 직급과 나이를 입력 받아서 직급이 7또는 8이고 나이가 40대이면 연금 80%
 * 직급이 5 또는 6이고 나이가 50대면 연금 100%
 * 그 외의 경우는 연금 대상자 아님
 */

package Chap04;
import java.util.Scanner;
public class TestEx01 {

	public static void main(String[] args) {
		
		Scanner stdin=new Scanner(System.in);
		
		System.out.print("직급 입력 : ");
		int level=stdin.nextInt();
		
		System.out.print("나이 입력 : ");
		int age=stdin.nextInt();
		
		if (((level==7)||(level==8))&&(age/10)==4)		// | : pipeline
			System.out.println("연금 80%");
		else if ((level==5||level==6)&&(age/10)==5)
			System.out.println("연금 100%");
		else 
			System.out.println("연금 대상자 아님");
		
		stdin.close();
	}

}
