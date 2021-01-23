//By Yun Peng Zou 500628304
import java.time.Month;
import java.util.*;
public class AccountingSystem {
	Map<Integer, Transaction> system;
	private static int id = 0;
	public AccountingSystem() {
		system = new TreeMap<Integer, Transaction>();
	}
	
	public String add(Calendar date, Car car, String salesPerson, String type, double salePrice) {
		Transaction rec = new Transaction(id,(GregorianCalendar) date, car,salesPerson,type, (int) salePrice);
		system.put(id, rec);
		id++;
		return rec.display();
	}
	
	public Transaction getTransaction(int id) {
		if (!system.containsKey(id))
			return null;
		return system.get(id);
	}
	
	
	
	public void getSales() {
		Set<Integer> keySet = system.keySet();
		for (Integer key : keySet) 
		    System.out.println(system.get(key).display());
	}
	
	public void getMonth(int month) {
		Set<Integer> keySet = system.keySet();
		int temp;
		for (Integer key : keySet) {
		    temp = system.get(key).getDate().get(Calendar.MONTH);
		    if(temp == month)
		    	 System.out.println(system.get(key).display());
		}
	}
	
	public int getSaleMonth(int month) {
		Set<Integer> keySet = system.keySet();
		int temp;
		int count = 0;
		for (Integer key : keySet) {
		    temp = system.get(key).getDate().get(Calendar.MONTH);
		    if(temp == month)
		    	 count++;
		}
		return count;
	}
	
	public void displayStat() {
		Set<Integer> keySet = system.keySet();
		double total = 0;
		int sold = 0;
		int month= -1, carMonth = -1, count;
		
		int ret=0;
		Transaction temp;
		for (Integer key : keySet) {
		    temp=system.get(key);
		    if(temp.getType().equals("BUY")) {
		    	total+= temp.getPrice();
		    	sold++;
		    }
		    else {
		    	total-= temp.getPrice();
		    	ret ++;
		    }
		}
		for(int i = 0; i <12; i ++) {
			count = this.getSaleMonth(i);
			
			
			if(carMonth<count) {
				carMonth = count;
				month = i;
			}
		}
		Month mon = Month.of(month+1);
		System.out.println("Total Sales: " + total + " Total Sold: "+ sold + " Avg Sales: " + (int)(total/12)+ " Total Returned: " + ret + " Best Month: " + mon+": cars sold - "+ carMonth);
			
	}
	public void getTop() {
		Set<Integer> keySet = system.keySet();
		int couJ =0,couP =0, couG = 0, couR = 0, couB = 0, max =0;
		for (Integer key : keySet) {
		   if(system.get(key).getName().equals("John"))
			   couJ++;
		   else if(system.get(key).getName().equals("Paul"))
			   couP++;
		   else if(system.get(key).getName().equals("George"))
			   couG++;
		   else if(system.get(key).getName().equals("Ringo"))
			   couR++;
		   else if(system.get(key).getName().equals("Bruce"))
			   couB++;
		}
		max = Math.max(couJ,Math.max(couP, Math.max(couG, Math.max(couR,couB))));
		String message = "TOP SP:";
		if(couJ == max)
			message += " John " + max;
		 if(couP == max)
			message += " Paul " + max;
		 if(couG == max)
			message += " George " + max;
		 if(couR == max)
			message += " Ringo " + max;
		 if(couB == max)
			message += " Bruce " + max;
		System.out.println(message);
	}
	
	
}
