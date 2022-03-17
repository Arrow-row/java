
//值传递--基本类型数据
public class PrimitiveTransferTest{
	public static void swap(int a,int b){
	int tmp=a;
	a=b;
	b=tmp;
	System.out.println("here in the func swap,a="+a+", b="+b);
}
	public static void main(String[] args){
		int a=6;
		int b=9;
		swap(a,b);
		System.out.println("after swaping:a="+a+"	b="+b);	//值传递
		
}

}
