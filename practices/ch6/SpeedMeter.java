public abstract class SpeedMeter{
	private double turnRate;
	public SpeedMeter(){}	//此抽象类的构造方法
	public abstract double calGirth();	//计算车轮周长的方法定义为抽象方法
	public void setTurnRate(double turnRate){
		this.turnRate=turnRate;
	}
	public double getSpeed(){	//定义计算速度通用方法
		return calGirth()*turnRate;
	}
}
