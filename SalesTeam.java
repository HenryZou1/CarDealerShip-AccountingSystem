import java.util.*;
//By Yun Peng Zou 500628304
public class SalesTeam {
	LinkedList <String> team; 
	public SalesTeam() {
		team = new LinkedList<String>(); 
		team.add("John");
		team.add("Paul");
		team.add("George");
		team.add("Ringo");
		team.add("Bruce");
	}
	
	public String getPerson() {
		Random rand = new Random();
		int id = rand.nextInt(team.size());
		return team.get(id);
	}
	public void getTeam() {
		ListIterator<String> iterator = team.listIterator();
		
		while (iterator.hasNext())
		    System.out.println(iterator.next()) ;
	    
	}
}
