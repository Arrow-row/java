//被重载的方法中包含个数可变的形参

public class OverloadVarargs{
	public void test(String msg){
		System.out.println("***func test() that contains only one string***");
	}
	public void test(String... books){
		System.out.println("***func test() that the formal args are changeable***");
	}
	public static void main(String[] args){
	
		OverloadVarargs olv=new OverloadVarargs();
		//下面两次调用执行第二个方法
		olv.test();
		olv.test("aa","bb");
		//下面调用执行第一个方法
		olv.test("aa");
		//下面调用执行第二个方法
		olv.test(new String[] {"aa"});	//个数可变的形参既可以传入多个参数，也可以传入一个数组，见Varargs.java
	}
}
