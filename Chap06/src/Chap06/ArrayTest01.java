/**
 * 2023-04-11
 * 
 */
package Chap06;
import java.util.Scanner;
public class ArrayTest01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int i;
		double sum=0.0;
		double avg;
		
		double dnum[]=new double[5];
		
		System.out.println("dnum 배열 길이 : "+dnum.length);
		System.out.println("초기화하지 않은 dnum[] 값 : ");
		
		for(i=0;i<5;i++)
		{
			System.out.println(dnum[i]+" ");	// d n u m[] 묵시적 값 출력
		}
		System.out.println();
		
		
		//input
		for(i=0;i<dnum.length;i++)
		{
			System.out.print("input dnum["+i+"] : ");
			dnum[i]=scanner.nextDouble();
		}
		System.out.println();

		//sum
		for(i=0;i<dnum.length;i++)
		{
			sum+=dnum[i];
		}
		
		//average
		avg=sum/dnum.length;
		
		//output
		System.out.println("배열의 합은 : "+sum+"입니다.");
		System.out.println("배열의 평균은 : "+avg+"입니다.");
		
		
		
		scanner.close();
	}

}
