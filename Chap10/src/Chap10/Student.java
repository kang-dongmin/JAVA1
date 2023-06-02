package Chap10;

public class Student extends People{
	
	public int studentNo;
	
	public Student(String name, String ssn, int studentNO) {
		super(name,ssn);		//부모 클래스의 기본 생성자 호출
		this.studentNo=studentNO;
	}

}
