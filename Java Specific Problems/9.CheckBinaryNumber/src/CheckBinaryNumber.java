import java.util.Scanner;

public class CheckBinaryNumber {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to check whether it is binary number or not ");
		long binaryNumber = scanner.nextLong();
		checkBinary(binaryNumber);
		
		scanner.close();

	}
	
	public static void checkBinary(long binaryNumber) {
		
		int temp = 0;
		if(binaryNumber <= 0 || binaryNumber == 1)
			System.out.println("Given number is not binary number");
		
		while(binaryNumber > 0) {
			
			if((binaryNumber%10) > 1) {
				temp++;
				break;
			}
				
			binaryNumber = binaryNumber / 10;
				
		}
		
		if(temp < 1)
			System.out.println("Given number is binary number");
		else
			System.out.println("Given number is not binary number");
		
	}

}