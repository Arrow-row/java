public class Person{
	//使用private将成员变量隐藏，外部类不能直接访问
	private String name;	
	private int age;
	public void setName(String name){	//提供setter方法来操作name成员变量
		if(name.length()>6||name.length()<2){
			System.out.println("illegal name string");
			return;
		}
		else{
			this.name=name;
		}
	}
	public String getName(){	//提供getter方法来操作name成员变量
		return this.name;
	}

	public void setAge(int age){       //提供setter方法来操作age成员变量
                if(age>100||age<0){
                        System.out.println("illegal age");
                        return;
                }
                else{
                        this.age=age;
                }
        }
        public String getAge(){        //提供getter方法来操作age成员变量
                return this.age;
        }
}

/*
public class Person{
public String name;
public int age;
public void say(String content)
{
	System.out.println(content);
}
}
*/
