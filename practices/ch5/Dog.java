public class Dog{
	public void jump(){
		System.out.println("***here is jump()***");
}
	public void run(){
		Dog d=new Dog();
		d.jump();	//没有使用static修饰的成员变量和方法须使用对象来调用
		this.jump();	//this关键字用来获得调用本方法的对象
		jump();		//Java允许对象的一个成员直接调用另一个成员（同一个对象两个方法之间的依赖）
		System.out.println("***here is run()***");
}
}
