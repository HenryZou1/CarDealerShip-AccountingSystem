//By Yun Peng Zou 500628304
import java.text.SimpleDateFormat;
import java.util.*;
public class Transaction {
	private int id;
	private GregorianCalendar date;
	private Car car;
	private String name;
	private String type;
	private int price;
	public Transaction(int id, GregorianCalendar date, Car car,String name, String type, int price) {
		this.id = id;
		this.date = date;
		this.car = car;
		this.name = name;
		this.type = type;
		this.price = price; 
	}
	
	public GregorianCalendar getDate() {
		return date;
	}
	public Car getCar() {
		return car;
	}
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	public int getPrice() {
		return price;
	}
	
	public String display() {
		SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy");
		sdf.setCalendar(date);
		String sdate =sdf.format(date.getTime());
		return "ID: "+ id+" " + sdate + " " + type + " SalesPerson: "+ name +" Car: " + car.display();
	}
	
}
