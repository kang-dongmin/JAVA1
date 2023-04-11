/**
 * 2023-04-11
 * 1차원 정수 배열 생성 후 가장 큰 값 찾기
 */
package Chap06;

public class ArrayTest02 {

	public static void main(String[] args) {
		
		int score[]= {88,97,53,92,68,82};
		
		int max=score[0];
		
		for(int i : score)
		{
			if (i>max)
			{
				max=i;
			}
		}
		System.out.printf("\n배열 요소의 최대값은 %d입니다.\n",max);
	}

}
