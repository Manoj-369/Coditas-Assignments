import java.util.*;

public class Main {

	public static void main(String[] args) {

		String name ="aaabcccdeeef";
		System.out.println("Here we are Calling the Method first :" + firstNotRepeatingCharacter(name));
		
		System.out.println("Here we are Calling the Method Second :" +firstNotRepeatingCharacter2(name));

	}
	static char firstNotRepeatingCharacter(String s) {
		for(int i=0;i<s.length();i++) {
			boolean SeenDuplicate =false;
			for(int j=0;j<s.length();j++) {
				
				if(s.charAt(i)==s.charAt(j) && i!=j) {
					SeenDuplicate =true;
					break;
				}
			}
			if(!SeenDuplicate)
				return s.charAt(i);
		}
		return '_';
		
	}

	// here is the 2nd Method 
	
	static char firstNotRepeatingCharacter2(String s) {
		HashMap<Character,Integer>char_counts =new HashMap<Character,Integer>();
		for(int i=0 ;i<s.length();i++) {
			char c =s.charAt(i);
			if(char_counts.containsKey(c)) {
				char_counts.put(c,char_counts.get(c)+1);
			}
			else {
				char_counts.put(c, 1);
			}
		}
		
		for(int i=0 ;i<s.length();i++) {
			char c =s.charAt(i);;
			if(char_counts.get(c)==1)
				return c;
		}
		
		return '_';
	}
}
