public class ConstructorTest{
	public String name;
	public int count;
	public ConstructorTest(String name,int count){	//自定义构造器，包含两个参数
		//构造器中的this代表它进行初始化的对象
		//下面两行代码将传入的2个参数赋值给this代表对象的name和count实例变量
		this.name=name;
		this.count=count;
	}
	public static void main(String[] args){
		//使用自定义构造器构造对象，系统会对该对象执行自定义的初始化
		ConstructorTest ct=new ConstructorTest("arrow",2022);	//自定义构造器后，系统不再提供默认构造器，因此不能再通过无参形式初始化对象，除非重载构造器
		System.out.println(ct.name);
		System.out.println(ct.count);
	}
}
