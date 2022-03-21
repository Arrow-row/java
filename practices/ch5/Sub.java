class Base{
	public double size;
	public String name;
	public Base(double size,String name){	//Base类的构造函数
		this.size=size;
		this.name=name;
	}
}
//Sub类构造器中通过super调用Base构造器的初始化代码
public class Sub extends Base{
	public String color;
	public Sub(double size,String name,String color){
		super(size,name);
		this.color=color;
	}
	public static void main(String[] args){
		Sub s=new Sub(5.6,"2022","0321");
		System.out.println(s.size+"--"+s.name+"--"+s.color);
	}
}
