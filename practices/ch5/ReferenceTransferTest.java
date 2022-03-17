
//值传递--引用类型
class DataWrap{
	int a;
	int b;
}
public class ReferenceTransferTest{
	public static void swap(DataWrap dw){
		int tmp = dw.a;
		dw.a = dw.b;
		dw.b = tmp;
		System.out.println("here in the func swap,menber var a="+dw.a+", b="+dw.b);
}
	public static void main(String[] args){
		DataWrap dw = new DataWrap();
		dw.a = 6;
		dw.b = 9;
		swap(dw);
		System.out.println("after swaping,a="+dw.a+", b="+dw.b);
	
}
}
