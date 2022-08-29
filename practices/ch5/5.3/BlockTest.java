//代码块局部变量
//局部变量除形参外，必须显示初始化，否则不可访问

public class BlockTest{
	public static void main(String[] args){
		{	//***代码块开始括号***
			int a;	//a是代码块局部变量
			//System.out.println("value of block var a="+a);   //将会出现错误，因为a未初始化
			a=5;
			System.out.println("value of block var a="+a);
		}
		//System.out.println(a)	//试图访问的变量a并不存在,离开了所在的代码块，局部变量a会被立即销毁
	}
}
