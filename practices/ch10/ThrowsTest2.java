import java.io.*;

public class ThrowsTest2{
	public static void main(String[] args)
		throws Exception{
		//test()方法声明抛出异常，调用test()的代码要么放在try块中，要么处于另一个带throws声明的方法中
		test();
    	}
    
	public static void test() throws IOException{
		//FileInputStream的构造器声明抛出IOException异常
		FileInputStream fis=new FileInputStream("a.txt");
	}
	
}

/*[root@iZm5e211s4jw7g4w6pgezgZ bin]# java ThrowsTest2 
Exception in thread "main" java.io.FileNotFoundException: a.txt (No such file or directory)
	at java.base/java.io.FileInputStream.open0(Native Method)
	at java.base/java.io.FileInputStream.open(FileInputStream.java:219)
	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:112)
	at ThrowsTest2.test(ThrowsTest2.java:12)
	at ThrowsTest2.main(ThrowsTest2.java:7)

 *
 * */
