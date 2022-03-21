class BaseClass{
	public int a=5;
}
public class SubClass extends BaseClass{
	public int a=7;
	public void accessOwner(){
		System.out.println(a);
	}
	public void accessBase(){
		System.out.println(super.a);	//super 访问父类的实例变量
	}
	public static void main(String[] args){
		SubClass sc=new SubClass();	
		sc.accessOwner();
		sc.accessBase();
	}
}

/*
1.当系统创建了SubClass对象时，实际上会为SubClass对象分配两块内存，一块用于存储在SubClass类中定义的a实例变量，一块用于存储从BaseClass类继承得到的a实例变量。当程序创建一个子类对象时，系统不仅会为该类中定义的实例变量分配内存，也会为它从父类继承得到的所有实例变量分配内存，即使子类定义了与父类中同名的实例变量
2.方法中访问成员变量a未显示指定调用者时，系统查找a顺序为：当前方法-当前类-直接父类-间接父类直到java.lang.Object
*/
