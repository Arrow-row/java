package larry;
public class OutputFieldTest{
	public static void main(String[] args){
		//访问arrow包中的Output接口的MAX_CACHE_LINE
		System.out.println(arrow.Output.MAX_CACHE_LINE);
		//下面语句会引发“为final变量赋值“的编译异常
		//arrow.Output.MAX_CACHE_LINE=20;
		//使用接口调用类方法
		System.out.println(arrow.Output.staticTest());
	}
}
