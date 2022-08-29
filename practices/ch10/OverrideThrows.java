import java.io.*;

public class OverrideThrows{
	public void test() throws IOException{
		var fis=new FileInputStream("a.txt");
	}
}
class Sub extends OverrideThrows{
	public void test() throws Exception{}	//子类方法声明抛出比父类方法更大的异常,编译将出错
}

/*[root@iZm5e211s4jw7g4w6pgezgZ ch10]# javac -d bin/ OverrideThrows.java 
OverrideThrows.java:9: error: test() in Sub cannot override test() in OverrideThrows
	public void test() throws Exception{}	//子类方法声明抛出比父类方法更大的异常将出错
	            ^
  overridden method does not throw Exception
1 error

 *
 * */
