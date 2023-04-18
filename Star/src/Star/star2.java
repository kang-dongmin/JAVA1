/**
 * 2023-04-18
 * 직각삼각형 상하반전
 */
package Star;
import java.util.Scanner;
public class star2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin =new Scanner(System.in);
		
		//reverse	
		
		System.out.print("input number : ");
		int n=stdin.nextInt();
		
		for(int i=n;i>0;i--)
		{
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		stdin.close();
	}

}
