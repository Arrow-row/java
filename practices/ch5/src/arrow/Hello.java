package arrow;	//本源文件中定义的所有类都属于这个包
public class Hello{
	public static void main(String[] args){
		System.out.println("Hello World");
	}
}

/*
1.使用 javac -d . Hello.java 在当前目录生成新文件夹arrow，arrow下包含Hello.class
2.在arrow文件中执行文件报错
[root@iZm5e211s4jw7g4w6pgezgZ arrow]# java arrow.Hello
Error: Could not find or load main class arrow.Hello
3.将路径换为包外路径，再执行正常
*/
