/**
 * null과 NullPointException
 * 참조변수의 ==연산과 equals()메소드
 * 
 * 
 */
package Chap06;
import java.util.Arrays;
public class ArrayReference2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] intArray=null;
	//	intArray[0]=10;		참조객체 없으므로 Nullpointexception	
		
		String strVal1="java";		//string도 클래스
		String strVal2="java";
		
		if (strVal1==strVal2) {
			System.out.println("strVal1, strVal2 same reference. ");
		} else {
			System.out.println("strVal1, strVal2 diferent reference. ");
		}
		
		String strVal3=new String("mklee");
		String strval4=new String("mklee");
		
		if(strVal3==strval4) {
			System.out.println("strvar3, strVal4 same reference. ");
		} else {
			System.out.println("strVal3, strVal4 diferent reference. ");
		}
		
		if (strVal3.equals(strval4)) {
			System.out.println("strVal3, strVal4 same string.");
		}
	}

}
