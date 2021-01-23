//By Yun Peng Zou 500628304
import java.util.*;
public class Vehicle {
	private String mfr;
	private String color;
	private int power;
	private int numWheels;
	public  int ELECTRIC_MOTOR =0;
	public  int GAS_ENGINE =1;
	private int VIN;
	public Vehicle(String man, String col, int  pow, int wheel) {
		mfr= man;
		color = col;
		power = pow;
		wheel = numWheels;
		Random rand = new Random();
		VIN = rand.nextInt(399);
		VIN = VIN + 100;
	}
	
	public int getVIN() {
		return VIN;
	}
	
	public String getManu() {
		return mfr;
	}
	
	public void setManu(String manu) {
		mfr= manu;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String col) {
		color = col;
	}
	
	
	public int getPower() {
		return power;
	}
	
	public void setPower(int pow) {
		power = pow;
	}
	
	public int getWheel() {
		return numWheels;
	}
	
	public void setWheel(int wheel) {
		numWheels = wheel;
	}
	
	public boolean equals(Object other) {
		Vehicle otherv = (Vehicle) other;
		
		if(mfr.equals(otherv.getManu())  && power== otherv.getPower() && numWheels == otherv.getWheel())
			return true;
		return false; 
	}
	
	public String display() {
		return"VIN "+ VIN +" "+ mfr +" "+ color;
	}
	
}
