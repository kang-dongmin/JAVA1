/**
 * 2023.03.28
 * 강동민
 * 반복문(while) -1~10 합계 구하기
 */

package Chap05;

public class WhileTest {

	public static void main(String[] args) {
		
		int sum=0;
		int cnt=1;
		
		
		//while
		while(cnt<=10)
		{
			sum+=cnt;
			cnt++;
		}
		System.out.println(String.format("1~10 total(while) : %d",sum));

		
		//sum
		sum=0;
		for(int i=1;i<=10;i++)
		{
			sum+=i;
		}
		System.out.println(String.format("1~10 total(for) : %d",sum));
		
		
		//do - while
		sum=0;
		cnt=1;
		do {
			sum+=cnt;
			cnt++;
		} while (cnt<=10);
		System.out.println("1~10 total(do-while) : "+sum);
		
		
		
		
		
	}

}
