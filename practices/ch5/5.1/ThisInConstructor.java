public class ThisInConstructor{
	public int foo;	//类的成员变量
	public ThisInConstructor(){
		int foo=0;	//构造器局部变量与类成员变量名称相同，默认会覆盖成员变量
		this.foo=6;	//this代表本构造器正在初始化的对象；本行把构造器正在初始化的对象的foo成员变量设置为6
				//构造器中访问其他成员，默认可以省略this，但局部有同名时不能省略
}
	public static void main(String[] args){
		System.out.println(new ThisInConstructor().foo);
}
}
