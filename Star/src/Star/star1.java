/**
 * 2023-04-18
 * 직각삼각형
 */
package Star;
import java.util.Scanner;
public class star1 {

	public static void main(String[] args) {
		Scanner stdin =new Scanner(System.in);
		
		System.out.print("input number : ");
		int n=stdin.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		stdin.close();
	}
}
