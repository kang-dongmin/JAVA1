package chap11;

class Person
{
	String name;
	String age;
	
	public Person(String name)
	{
		this.name=name;
	}
}

class Student extends Person
{
	String grade;
	String department;
	
	public Student(String name)
	{
		super(name);
	}
}


public class CastingTest_2 {

	public static void main(String[] args) {
		Person p;
		Student s=new Student("Lee");
		p=s;		//자동타입변환(upcasting)
				//student객체가 person타입으로 업캐스팅
				//student 클래스의 필드나 메소드에 접근 불가
		
		System.out.println(p.name);
		
		Person p1=new Student("Kim");
		Student s1;
		s1=(Student)p1;
		
		System.out.println(s1.name);
	}

}
