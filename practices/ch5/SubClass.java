class BaseClass{
	public int a=5;
	public int book=6;
	public void base(){
		System.out.println("normal function of parent");
	}
	public void test(){
		System.out.println("overridden function of parent");
	}
}
public class SubClass extends BaseClass{
	public int a=7;

	//重新定义book实例变量隐藏父类book实例变量
	public String book="2022";
	public void test(){
		System.out.println("subclass function overriding parent's");
	}
	public void sub(){
		System.out.println("normal function of subclass");
	}

	public void accessOwner(){
		System.out.println(a);
	}
	public void accessBase(){
		System.out.println(super.a);	//super 访问父类的实例变量
	}
	public static void main(String[] args){
		//SubClass sc=new SubClass();	
		//sc.accessOwner();
		//sc.accessBase();

		BaseClass bc=new BaseClass();	//使用BaseClass系统默认无参构造器
		System.out.println(bc.book);
		bc.base();
		bc.test();

		SubClass sc=new SubClass();
		System.out.println(sc.book);
		sc.base();
		sc.test();

		BaseClass ploymophicBc=new SubClass();
		System.out.println(ploymophicBc.book);	//输出6，表明访问的是BaseClass对象的实例变量
		ploymophicBc.base();	//执行从父类继承的base()
		ploymophicBc.test();	//执行当前类test()
		//ploymophicBc.sub()	//ploymophicBc编译时类型是BaseClass,BaseClass 类未提供sub方法，此行编译时会报错

	
	}
}

/*
1.当系统创建了SubClass对象时，实际上会为SubClass对象分配两块内存，一块用于存储在SubClass类中定义的a实例变量，一块用于存储从BaseClass类继承得到的a实例变量。当程序创建一个子类对象时，系统不仅会为该类中定义的实例变量分配内存，也会为它从父类继承得到的所有实例变量分配内存，即使子类定义了与父类中同名的实例变量
2.方法中访问成员变量a未显示指定调用者时，系统查找a顺序为：当前方法-当前类-直接父类-间接父类直到java.lang.Object
*/
