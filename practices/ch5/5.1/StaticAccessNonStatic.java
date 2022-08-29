public class StaticAccessNonStatic{
	public void info(){
		System.out.println("***here is no static info()***");
}
	public static void mian(String[] args){
	info(); //info()方法是属于实例的方法，而不是属于类的方法

/*
1.mian()方法是静态方法,info()非静态;调用main()的是该类本身，而不是该类的实例,因此省略的this无法指向有效的对象
-------报错----------
StaticAccessNonStatic.java:6: error: non-static method info() cannot be referenced from a static context
	info();
	^
1 error
---------------------

2.在静态方法中访问普通方法，须创建对象
new StaticAccessNonStatic().info();	
*/
}
}
