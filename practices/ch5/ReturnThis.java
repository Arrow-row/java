public class  ReturnThis{
	public int age;
	public ReturnThis grow(){
		age++;
		return this;	//返回调用该方法的对象;this作为对象的默认引用来使用
				//注意本函数返回值类型是ReturnThis
}
	public static void main(String[] args){
	ReturnThis rt=new ReturnThis();
	rt.grow().grow().grow();	//（把this作为返回值）可以连续调用同一个方法，使代码简洁
	System.out.println("the rt has a member var:"+rt.age);
}
}
