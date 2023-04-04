package chap03;

//03/21

import java.util.Scanner;
public class TernaryOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin=new Scanner(System.in);
		
		System.out.print("input number");
		int a=stdin.nextInt();	
		
		boolean flag;
		flag=(a%2==0)?true:false;
		/*System.out.print(a+"이 짝수인가? : ");
		System.out.println(flag);*/
		System.out.printf("%d이 짝수인가? : %b\n",a,flag);
		stdin.close();
	}

}
