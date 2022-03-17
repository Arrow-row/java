public class StaticAccessNonStatic{
	public void info(){
		System.out.println("***here is no static info()***");
}
	public static void mian(String[] args){
	info();

	/*
	mian()方法是静态方法,info()非静态
	调用main()的是该类本身，而不是该类的实例
	因此省略的this无法指向有效的对象
	*/
}
}
