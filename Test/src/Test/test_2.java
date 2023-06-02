package Test;

abstract class Calculator
{
	public abstract int add(int a, int b);
	public abstract int substract(int a, int b);
	public abstract int mul(int a, int b);
	public abstract int div(int a, int b);
	public abstract double average(int []a);
}

class GoodCalc extends Calculator
{
	@Override
	public int add(int a, int b)
	{
		return a+b;
	}
	
	@Override
	public int substract(int a, int b)
	{
		return a-b;
	}
	
	@Override
	public int mul(int a, int b)
	{
		return a*b;
	}
	
	@Override
	public int div(int a, int b)
	{
		return a/b;
	}
	
	@Override
	public double average(int []a)
	{
		double sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		return sum/a.length;
	}
			
}

public class test_2 {

	public static void main(String[] args) {
		
		GoodCalc c=new GoodCalc();
		System.out.println("2 + 3 : "+c.add(2, 3));
		System.out.println("2 - 3 : "+c.substract(2, 3));
		System.out.println("2 * 3 : "+c.mul(2, 3));
		System.out.println("5 / 2 : "+c.div(5,2));
		System.out.println("avg : "+c.average(new int[] {2,3,4}));
	}
}
