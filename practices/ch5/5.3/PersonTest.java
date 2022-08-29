class Person{
	//成员变量（类变量、实例变量）无需显式初始化，系统在类的准备阶段或实例创建阶段默认初始化
	public String name;
	public static int eyeNum;
}
public class PersonTest{
	public static void main(String[] args){
		System.out.println("class var eyeNum of Person:"+Person.eyeNum);
		var p=new Person();
		System.out.println("instance var name of object Person:"+p.name+"class var eyeNum of object Person:"+p.eyeNum);
		p.name="Alice";
		p.eyeNum=2;
		System.out.println("instance var name of object Person:"+p.name+"class var eyeNum of object Person:"+p.eyeNum);
		System.out.println("class var eyeNum of Person:"+Person.eyeNum);
		Person p2=new Person();
		System.out.println("eyeNum value of p2:"+p2.eyeNum);
	}
}

/*
Person p;
p=new Person();
p.name="arrow";
p.say("hello");
System.out.println(p.name);
*/
