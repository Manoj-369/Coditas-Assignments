import java.util.*;

public class ReverseString {

	
	public static void main(String[] args) {
		
		System.out.println("Enter the word");
		
		Scanner sc =new Scanner(System.in);
		String word =sc.nextLine();
		
		
		System.out.println(ReverseString(word));
		
		
	}
	static  String ReverseString (String word) {

	
		
		if(word.isEmpty()) {
			return word;
		}
		else {
			return ReverseString(word.substring(1))+word.charAt(0);
		}
	}

}
