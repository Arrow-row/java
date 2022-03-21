//Ostrich对象既可以调用自己重写的fly()方法，也可以调用Bird中被覆盖的fly()方法

public class Ostrich extends Bird{
	//override
	public void fly(){
		System.out.println("runing");
	}
	public void callOverrideMethod(){
		//在子类方法中通过suoer显示调用父类被覆盖的实例方法
		//super不能出现在static修饰的方法中（调用这类方法的可能是类而不是对象）
		super.fly();
	}
	public static void main(String[] args){
		Ostrich os=new Ostrich();
		os.fly();
		os.callOverrideMethod();
	}
}
