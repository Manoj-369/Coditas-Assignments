import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("print fibonacci series upto ");
		int number = scanner.nextInt();
		findFibonacci(number);
		scanner.close();

	}
	
	public static void findFibonacci(int number) {
		
		int firstNumber=0, secondNumber=1, nextNumber;
		
		System.out.print("Fibonacci are : " + firstNumber + " " + secondNumber+" ");
		for(int i=2;i<number;i++) {
			
			nextNumber = firstNumber + secondNumber;
			System.out.print(nextNumber+" ");
			firstNumber = secondNumber;
			secondNumber = nextNumber;
		}
		
	}

}