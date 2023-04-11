/**
 * 2023-04-11
 * 2차원 배열의 값은 난수로 초기화
 * 2차원 배열의 각 행의 합계 출력
 */

package Chap06;
import java.util.Random;
public class MultiArrayTest {

	public static void main(String[] args) {
		Random ran=new Random();			//난수 발생
		
		int [][]score=new int[4][4];		//2차원 배열 생성
		
		for(int i=0;i<4;i++) {			//row
			for (int j=0;j<4;j++) {		//column
				score[i][j]=ran.nextInt(10);		//0~9까지의 난수 생성
			}
		}
		
		for (int k=0;k<4;k++) {		// row
			int sum=0;
			for (int value : score[k]) {		//column
				System.out.print(value+" ");
				sum+=value;		//row`s sum
			}
			System.out.print("sum is "+sum);
			System.out.println();
		}
		
		
		
		

	}

}
