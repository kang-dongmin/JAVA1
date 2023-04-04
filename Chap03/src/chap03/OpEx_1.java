/**
 * 동전교환 프로그램
 * 입력된 액수만큼 500원,100원,50원10원짜리 동전으로 교환해 주는 프로그램 작성
 * 조건1 : 동전의 총개수를 최소화
 * 조건2 : 고액의 동전 우선 교환
 */

package chap03;
import java.util.Scanner;
public class OpEx_1 {

	public static void main(String[] args) {
	
		Scanner stdin=new Scanner(System.in);
		System.out.print("액수 입력 : ");
		int money=stdin.nextInt();
		
		int coin_10,coin_50,coin_100,coin_500;
		
		coin_500=money/500;
		
		money=money%500;
		
		coin_100=money/100;
		money=money%100;
		
		coin_50=money/50;
		money=money%50;
		
		coin_10=money/10;
		money=money%10;
		
		System.out.printf("\n500원 : %d개\n",coin_500);
		System.out.printf("100원 : %d개\n",coin_100);
		System.out.printf("50원 : %d개\n",coin_50);
		System.out.printf("10원 : %d개\n",coin_10);
		
		stdin.close();
	}

}
