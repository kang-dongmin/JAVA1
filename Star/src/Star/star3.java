/**
 * 2023-04-18
 * 직각삼각형 좌우반전
 */
package Star;
import java.util.Scanner;
public class star3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("input number : ");
		int n=stdin.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		stdin.close();
	}

}
