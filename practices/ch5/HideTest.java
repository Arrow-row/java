class Parent{
	public String tag="2022";
}
class Derived extends Parent{
	private String tag="0321";
}
public class HideTest{
	public static void main(String[] args){
		Derived d=new Derived();
		//System.out.println(d.tag);      //私有变量不可访问，编译出错
		System.out.println(((Parent)d).tag)	//d向上转型为Parent后可以访问tag实例变量
	}


}
