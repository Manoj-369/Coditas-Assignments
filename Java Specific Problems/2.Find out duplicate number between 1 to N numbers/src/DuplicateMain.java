import java.util.*;

public class DuplicateMain {

	public static void main(String[] args) {

		List<Integer>numbers =new ArrayList<Integer>();
		
		//Adding the Numbers to the Numbers
		
		for(int i=0;i<=30;i++) {
			numbers.add(i);
		}
		
		//here we added the duplicate
		
		numbers.add(10);
		
		//here we are calling the duplicate function to find the Duplicate Number
		System.out.println("The Duplicate numbers is : " + duplicate(numbers));
		
		
	}
	static int duplicate(List<Integer> numbers)
	{
		int Size =numbers.size()-1;
		int sum =0;
		
		for(int num:numbers) {
			 sum +=num;
		}	 
		
		return sum - (((Size - 1) * Size) / 2); 
			
		
		
	}
	
	
	
	

}
