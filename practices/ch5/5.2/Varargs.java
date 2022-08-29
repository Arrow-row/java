public class Varargs{
	public static void test(int a,String... books){		//在最后一个形参后面增加三点表示该形参可接受多个参数值，多个参数值被当作数组传入
		for(String tmp:books)	
		{
			System.out.println(tmp);
		}
		System.out.println(a);
	}
	public static void main(String[] args){
		test(5,"a","b","c");
	}

}

/*
 *[root@iZm5e211s4jw7g4w6pgezgZ class]# java Varargs 
a
b
c
5
 * */

/*
1.形参个数可变的参数本质就是一个数组参数；下面两个方法签名效果相同，在方法体中都可以把books当成数组处理

public static void test(int a,String... books);	//可变形参

public static void test(int a,String[] books);	//数组形参

2.调用两个方法时存在差别

test(5,"a","b");	//可变形参：既可以传入多个参数，也可以传入一个数组

test(5,new String[] {"a","b"});	//数组形参：实参数值须为一个数组

3.数组形参可以位于形参列表任意位置，可变形参只能在形参列表最后，一个方法最多只能有一个可变形参

*/
