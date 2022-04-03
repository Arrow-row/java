import java.util.*;
import java.io.*;

public class ThrowsTest{
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("a.txt");	//一旦使用throws语句声明抛出该异常，程序就无须使用try...catch块来捕获该异常

	}
}
