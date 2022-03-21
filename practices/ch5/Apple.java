public class Apple extends Fruit{	//Java是单继承，每个类最多只有一个直接父类,可以有多个间接父类
	public static void main(String[] args){
		Apple a= new Apple()	//子类不继承父类的构造器，有自己的默认构造器;
		a.weight=56;
		a.info();
	}
}
