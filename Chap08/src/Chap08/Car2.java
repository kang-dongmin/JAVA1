package Chap08;

public class Car2 {
//field
	String company="쉐보레";
	String model;	//null
	String color;	//null
	int maxSpeed;	//0
	
	//생성자1
	public Car2()
	{
		
	}
	
	//생성자2
	public Car2(String model) 
	{
		this(model,"은색",250);	//생성자4 호출
	}
	
	//생성자 3
	public Car2(String model, String color)
	{
		this(model,color,250);		//생성자 4 호출
	}
		
		//생성자 4
	public Car2(String model,String color, int maxSpeed)		//공통 실행 코드
	{
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
		
	
}
