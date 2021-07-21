import java.util.Scanner;

public class CheckPerfectNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to check wheather it is Perfect Number or not");
		int number = scanner.nextInt();
		checkPerfectNumber(number);
		scanner.close();
	}
	
	public static void checkPerfectNumber(int number) {
		
		int sum = 1;
		
		if(number == 1 )
			System.out.println("Given number "+ number+" is not a perfect number");
		
		for(int i = 2; i<number;i++) {
			if(number%i == 0)
				sum = sum + i;
		}
		
		if(number == sum)
			System.out.println("Given number "+ number+" is a perfect number");
		else
			System.out.println("Given number "+ number+" is not a perfect number");
	}

}