package Chap09.exam04;

public class A {

	//field
	public int field1;
	int field2;
	private int field3;
	
	//constructor
	public A() {
		field1=1;	// (O)
		field2=1;	// (O)
		field3=1;	// (O) 동일 클래스 내에서 접근 가능
		
		method1();	// (O)
		method2();	// (O)
		method3();	// (O) 동일 클래스 내에서 접근 가능
	}
	
	//method
	public void method1() {}
	void method2() {}
	private void method3() {}
}
