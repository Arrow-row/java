public interface Output{
	//1.接口中定义的成员变量只能是常量
	//2.在接口中定义成员变量时，不管是否使用public static final，系统都会自动添加这三个修饰符
	int MAX_CACHE_LINE=50;

	//1.接口中普通方法只能是public修饰
	//2.接口里定义的方法只能是抽象方法、类方法、默认方法或私有方法，系统将自动为普通方法增加abstract修饰符
	void out();
	void getData(String msg); 

	//默认方法：须使用default,不能使用static，系统自动添加public，通过接口实现类的实例调用
	default void print(String... msgs){
		for (String msg:msgs){
			System.out.println(msg);
		}
	}
	default void test(){
		System.out.println("test() of default func");
	}

	//类方法：须static修饰，不能使用default，系统自动添加public，可以直接使用接口来调用
	static String staticTest(){
		return "classic method";
	}

	/*java9引入私有方法
	//私有方法
	private void foo(){
		System.out.println("private method foo()");
	}
	//私有静态方法
	private static void bar(){
		System.out.println("private static method bar()");
	}
	*/

}

/*
1. 接口里定义的方法只能是抽象方法、类方法、默认方法或私有方法，系统将自动为普通方法增加abstract修饰符
2.接口里的普通方法不能有方法实现（方法体），因为其实是抽象方法，但类方法、默认方法、私有方法都必须有方法实现（方法体）
3.在接口中定义成员变量时，不管是否使用public static final修饰符，系统都会自动添加这三个修饰符
 * */
