//被重载的方法中包含个数可变的形参

public class OverloadVarargs{
	public void test(String msg){
		System.out.println("***func test() that contains only one string***");
	}
	public void test(String... books){ //1.形参个数可变的参数本质就是一个数组参数,不能通过直接传入一个字符串参数来调用  2.此处的个数可变形参不包含一个字符串参数的形式
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
