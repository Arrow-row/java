public class Recursive{
	public static int recursive(int n){

		/*定义递归方法原则：向已知方向递归
		if (n==0) return 1;
		else if(n==1) return 4;
		else return 2*recursive(n-1)+recursive(n-2);	//向小端递归
		*/
	
		if(n==20) return 1;
		else if(n==21) return 4;
		else return recursive(n+2)-2*recursive(n+1);	//向大端递归

	}
	public static void main(String[] args){
		int res=recursive(10);
		System.out.println("f(10)="+res);
	}

}
