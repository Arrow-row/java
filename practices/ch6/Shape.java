public abstract class Shape{
	//初始化块
	{
		System.out.println("init block of Shape...");
	}
	
	//abstract不能用于修饰成员变量，不能用于修饰局部变量，即没有抽象变量、没有抽象成员变量等说法
	private String color;
	
	//抽象类
	public abstract double calPerimeter();
	public abstract String getType();

	//Shape构造器，用于被子类调用
	//abstract不能用于修饰构造器，没有抽象构造器，抽象类里定义的构造器只能是普通构造器
	public Shape(){}	
	public Shape(String color){
		System.out.println("constructor of Shape...");
		this.color=color;
	}

	public String getColor(){
		return this.color;
	}
}
