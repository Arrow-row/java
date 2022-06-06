
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
		dw=null;	//swap()中的dw变量不再指向任何有效内存；这行是否加上不影响输出结果；说明与main()中的dw是两个变量，引用类型也是值传递
}
	public static void main(String[] args){
		DataWrap dw = new DataWrap();
		dw.a = 6;
		dw.b = 9;
		swap(dw); //dw是引用变量，将main栈中dw的引用值传给swap栈的dw引用，是值传递，DataWrap在内存中只有一份，两个dw引用指向相同
		System.out.println("after swaping,a="+dw.a+", b="+dw.b);
	
}
}

/*
 *[root@iZm5e211s4jw7g4w6pgezgZ class]# java ReferenceTransferTest 
here in the func swap,menber var a=9, b=6
after swaping,a=9, b=6
 * */
