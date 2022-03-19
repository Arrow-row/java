package arrow;
import arrow.sub.Apple;	//导入指定类
import arrow.*;	//导入指定包下全部类，其中*只能代表类，不能代表包，即arrow下的sub子包内的类不会被此语句导入
public class HelloTest{
	public static void main(String[] args){
		Hello h=new Hello();	//同一个包下的类可以自由访问，无需添加包前缀
		arrow.sub.Apple a=new arrow.sub.Apple();	//不同包（包括子包）下需要完整包前缀.类名;类型声明时也需要
		Apple a2=new Apple();	//导入后无需包前缀
	}
}

/*
-----------------------------------------------------
执行时找不到main函数
[root@iZm5e211s4jw7g4w6pgezgZ src]# java arrow.HelloTest
Error: Could not find or load main class arrow.HelloTest
需要进入.class文件的最外层执行
[root@iZm5e211s4jw7g4w6pgezgZ classes]# java arrow.HelloTest
-----------------------------------------------------
*/
