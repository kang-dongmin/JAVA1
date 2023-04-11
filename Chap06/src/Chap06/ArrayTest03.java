/**
 * 2023-04-11
 * 1차원 배열에서 입력받은 값 검색하기 (선형 검색)
 */
package Chap06;
import java.util.Scanner;
public class ArrayTest03 {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		
		int inum[]= {8,7,3,6,8,7,0,4,1,2};
		int cnt=0;
		
		System.out.print("input number : ");
		int key=stdin.nextInt();
		
		for(int i=0;i<inum.length;i++) {
			if (key==inum[i]) {
				cnt++;
				System.out.printf("%d`s index : %d\n",key,i+1);
			}
		}
		if (cnt==0)
			System.out.printf("\n%d not match\n",key);
		else
			System.out.printf("\n%d`s count : %d\n",key,cnt);
			
		stdin.close();
	}
}
