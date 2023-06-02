package Chap10;

public class Computer extends Calculator {
	@Override 
	double areaCircle(double r) {	//재정의
		System.out.println("Excuting areaCircle() of the Computer object.");
		return Math.PI*r*r;
	}
	

}
