package chap03;
/**
 * 확대 형 변환
 * 3/21
 * @author 동민
 *
 */
import java.util.Scanner;
public class Casting_widening {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin=new Scanner(System.in);
		
		System.out.print("first integer:");
		int first=stdin.nextInt();
		
		System.out.print("second integer:");
		int second=stdin.nextInt();
		
		double avg1=(first+second)/2;
		double avg2=(first+second)/2.0;	//확대형변환
		double avg3=(first+second)/(float)2;	//형변환
		
		System.out.println("정수연산 : "+avg1);
		System.out.println("실수연산 : "+avg2);
		System.out.println("실수연산 : "+avg3);
		
		stdin.close();
	}

}
