public class Circle extends Shape{
	private double radius;
	public Circle(String color,double radius){
		super(color);
		this.radius=radius;
	}
	public void setRadius(double radius){
		this.radius=radius;
	}
	public double calPerimeter(){
		return 2*Math.PI*radius;
	}
	public String getType(){
		return getColor()+"circle";
	}
	public static void main(String[] args){
		Shape s1=new Triangle("black",3,4,5);
		Shape s2=new Circle("red",3);
		System.out.println(s1.getType());
		System.out.println(s1.calPerimeter());
	        System.out.println(s2.getType());
                System.out.println(s2.calPerimeter());
	}	
}

/*
 
[root@iZm5e211s4jw7g4w6pgezgZ ch6]# java Circle 
init block of Shape...
constructor of Shape...
init block of Shape...
constructor of Shape...
triangle
12.0
redcircle
18.84955592153876

 * */
