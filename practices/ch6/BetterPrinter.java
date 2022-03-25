public class BetterPrinter implements Output{
	private String[] printData=new String[MAX_CACHE_LINE];
	private int dataNum=0;
	public void out(){
		while (dataNum>0){
			System.out.println("the printer printout:"+printData[0]);
			//把作业队列整体前移一位，剩下作业数-1
			System.arraycopy(printData,1,printData,0,--dataNum);
		}
	}
	public void getData(String msg){
		if(dataNum>=MAX_CACHE_LINE){
			System.out.println("error,overflowed queue...");
		}
		else {
			printData[dataNum++]=msg;
		}
	}
}
