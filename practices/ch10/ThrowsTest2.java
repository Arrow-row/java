public class ThrowsTest2{
	public static void main(String[] args){
		throws Exception{
		//test()方法声明抛出异常，调用test()的代码要么放在try块中，要么处于另一个带throws声明的方法中
		test();
	}
	public static void test() throws IOException{
		//FileInputStream的构造器声明抛出IOException异常
		FileInputStream fis=new FileInputStream("a.txt");
	}
	}
}
