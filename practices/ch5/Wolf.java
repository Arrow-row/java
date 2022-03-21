/*下面程序定义了三个类，它们之间有严格的继承关系，通过这种继承关系让读者看到构造器之间的调用关系
*/
class Creature{
	public Creature(){
		System.out.println("no parameter constructor of Creature");
	}
}
class Animal extends Creature{
	public Animal(String name){
		//子类构造器执行体中既没有super调用，也没有this调用，系统将会在执行子类构造器之前，隐式调用父类无参数的构造器
		//这里会先调用父类 Creature()
		System.out.println("constructor with a parameter of Animal,"+"we call it "+name);
	}
	public Animal(String name,int age){
		this(name);
		System.out.println("constructor with two parameter of Animal,"+"it's "+age+" years old");
	}
}
public class Wolf extends Animal{
	public Wolf(){
		super("wolf",3);
		System.out.println("no parameter constructor of Wolf");
	}
	public static void main(String[] args){
		new Wolf();
	}
}

/*执行结果 
no parameter constructor of Creature
constructor with a parameter of Animal,we call it wolf
constructor with two parameter of Animal,it's 3 years old
no parameter constructor of Wolf
*/

