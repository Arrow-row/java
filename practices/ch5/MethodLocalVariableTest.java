public class MethodLocalVariableTest{
	public static void main(String[] args){
		int a;	//方法局部变量
		//System.out.println("var a of lacol method="+a); //代码将出错，因为a还未初始化
		a=5;
		System.out.println("var a of lacol method="+a);
	}
}
