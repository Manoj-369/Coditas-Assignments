import java.util.Scanner;

public class CharacterOccurence {

	public static void main(String[] args) {
		
		Scanner scanner  = new Scanner(System.in);
		
		System.out.println("Enter string");
		String string = scanner.next();
		
		System.out.println("Enter character to find the count");
		char find = scanner.next().charAt(0);
		
		System.out.println("Given character occur "+ countCharacter(string,find) + " times");
		scanner.close();

	}
	
	public static int countCharacter(String string, char find ) {
		
		int count = 0;
		
		for(int i = 0 ; i< string.length();i++) {
			
			if(string.charAt(i) == find)
				count++;
			
		}
		
		
		return count;
		
	}

}