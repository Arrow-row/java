public class Overload{
	public void test(){
		System.out.println("no args");
	}
	public void test(String msg){
		System.out.println("the overload func test()"+msg);
	}
	public static void main(String[] args){
		Overload ol=new Overload();
		ol.test();
		ol.test("hello");
	}
}
