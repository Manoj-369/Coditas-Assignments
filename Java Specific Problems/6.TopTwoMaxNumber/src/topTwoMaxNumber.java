import java.util.Scanner;

public class topTwoMaxNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = scanner.nextInt();
		
		int[] numbers = new int[size];
		System.out.println("Enter numbers ");
		for(int i=0;i<size;i++) {
			numbers[i] = scanner.nextInt();
		}
		
		topTwoMaxNumber(numbers);
		
		scanner.close();

	}
	
	public static void topTwoMaxNumber(int[] numbers) {
		
		int maxNumber1 = 0, maxNumber2 = 0;
		
		for(int number : numbers) {
			if(maxNumber1 < number) {
				maxNumber2 = maxNumber1;
				maxNumber1 = number;	
			} else if(maxNumber2 < number){	
				maxNumber2 = number;
			}
		}
		
		System.out.println("First Top Number "+ maxNumber1);
		System.out.println("Second Top Number "+ maxNumber2);
		
	}

}