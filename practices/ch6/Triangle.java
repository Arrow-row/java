public class Triangle extends Shape{
	private double a;
	private double b;
	private double c;
	public Triangle(String color,double a,double b,double c){
		super(color);
		this.setSides(a,b,c);	//构造器也是通过setter来设置成员变量，不直接访问private变量
	}
	public void setSides(double a,double b,double c){
		if(a>=b+c||b>=a+c||c>=a+b){
			System.out.println("illegal sides...");
			return;
		}
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public double calPerimeter(){
		return a+b+c;
	}
	public String getType(){
		return "triangle";
	}
}
