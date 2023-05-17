package Chap09.exam04;

public class B {
	public B() {
		A a= new A();
		a.field1=1;
		a.field2=1;
		//a.field3=1;	(X) private 접근 불가
		
		a.method1();
		a.method2();
		//a.method3();	(X) private 접근 불가
	}
}
