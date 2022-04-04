import java.util.*;
import java.io.*;

public class ThrowsTest{
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("a.txt");	//一旦使用throws语句声明抛出该异常，程序就无须使用try...catch块来捕获该异常

	}
}

/*
[root@iZm5e211s4jw7g4w6pgezgZ bin]# java ThrowsTest
Exception in thread "main" java.io.FileNotFoundException: a.txt (No such file or directory)
	at java.base/java.io.FileInputStream.open0(Native Method)
	at java.base/java.io.FileInputStream.open(FileInputStream.java:219)
	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:112)
	at ThrowsTest.main(ThrowsTest.java:6)
*/
