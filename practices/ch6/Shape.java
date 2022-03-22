public abstract class Shape{
	//初始化块
	{
		System.out.println("init block of Shape...");
	}
	
	private String color;
	
	//抽象类
	public abstract double calPerimeter();
	public abstract String getType();

	//Shape构造器，用于被子类调用
	public Shape(){}	
	public Shape(color){
		System.out.println("constructor of Shape...");
		this.color=color;
	}

	public String getColor(){
		return this.color;
	}
}
