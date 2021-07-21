import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class SmallAndLargeNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int number; 
		
		System.out.println("Enter size of of arraylist");
		
		int size = scanner.nextInt();
		
		ArrayList<Integer> list = new ArrayList<>(size);
		System.out.println("Enter elements : ");
		
		for(int i = 0 ; i <  size;i++) {
			number = scanner.nextInt();
			list.add(number);
		}
			
		checkNumber(list);

	}

public static void checkNumber(ArrayList<Integer> elements) {
	
	Integer smallNumber = Collections.min(elements);
	Integer largeNumber = Collections.max(elements);
	
	System.out.println("Smallest number of array is : " + smallNumber + 
			" Largest number of array is : " + largeNumber );
	
	
}
	
}