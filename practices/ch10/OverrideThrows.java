import java.io.*;

public class OverrideThrows{
	public void test() throws IOException{
		var fis=new FileInputStream("a.txt")
	}
}
class Sub extends OverrideThrows{
	public void test throws Exception{}	//子类方法声明抛出比父类方法更大的异常将出错
}
