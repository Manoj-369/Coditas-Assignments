import java.util.*;

public class Main {

	public static void main(String[] args) {
		
	System.out.println("Enter the String ");
	
	Scanner sc= new Scanner(System.in);
	String name=sc.next();
	Occurance(name);		
	}
	
	static void Occurance(String name) {
		
		HashMap<Character ,Integer> char_counts=new HashMap<Character,Integer>();
		
		for(int i=0 ;i<name.length();i++) {
			
			char c = name.charAt(i);
			
			if(char_counts.containsKey(c)) {
				char_counts.put(c,char_counts.get(c)+1);
			}
			else {
				char_counts.put(c, 1);
			}
			
		}
		
		for(Map.Entry entry: char_counts.entrySet()) {
			System.out.println(entry.getKey() + " " +entry.getValue());
		}
	
	
	}
}
