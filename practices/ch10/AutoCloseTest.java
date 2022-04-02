//使用自动关闭资源的try语句

import java.util.*;
import java.io.*;

public class AutoCloseTest{
    public static void main(String[] args)
        throws IOException{
        try(
           //try圆括号中声明、初始化两个可关闭的资源，try语句会自动关闭这两个资源
           //这里的资源类是指需要显式关闭的，这些类本身必须实现close()方法
           BufferedReader br=new BufferedReader(
               new FileReader("AutoCloseTest.java"));
           PrintStream ps=new PrintStream(new FileOutputStream("a.txt"))
        ){
            //使用两个资源
            System.out.println(br.readLine());
            ps.println("there should be some words...");
        }
    }
    }

/*
 *[root@iZm5e211s4jw7g4w6pgezgZ bin]# java AutoCloseTest 
Exception in thread "main" java.io.FileNotFoundException: AutoCloseTest.java (No such file or directory)
	at java.io.FileInputStream.open0(Native Method)
	at java.io.FileInputStream.open(FileInputStream.java:195)
	at java.io.FileInputStream.<init>(FileInputStream.java:138)
	at java.io.FileInputStream.<init>(FileInputStream.java:93)
	at java.io.FileReader.<init>(FileReader.java:58)
	at AutoCloseTest.main(AutoCloseTest.java:9)

 *
 *
 * */
