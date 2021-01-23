//By Yun Peng Zou 500628304
public class ElectricCar  extends Car{
	private int rechargeTime;
	private String batteryType;
	
	public ElectricCar (int time, String bat,int mod, int max , double safe, boolean aw, double pri, String man, String col, int  pow, int wheel) {
		super( mod, max , safe,  aw,  pri,  man,  col,   pow,  wheel);
		rechargeTime = time;
		batteryType = bat;
	}
	
	public int getRechargeTime(){
		return rechargeTime;
	}
	
	public String getBatteryType(){
		return batteryType;
	}
	
	public void setRechargeTime(int t){
		rechargeTime = t;
	}
	
	public void setBatteryType(String b){
		batteryType= b;
	}
	
	public String display() {
		return super.display() +" EL, Bat:" +batteryType +" RCH: "+ rechargeTime;
	}
	
}
