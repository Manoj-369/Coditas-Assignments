import java.util.Scanner;

public class CheckPower {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to check it is power of two or not ");
		int number = scanner.nextInt();
		
		boolean flag = checkPower(number);
		if(flag)
			System.out.println("Given number "+number+ " is a power of two");
		else
			System.out.println("Given number "+number+ " is not a power of two");
		
		scanner.close();

	}
	
	public static boolean checkPower(int number) {
		
		boolean flag;
		while(number%2 == 0) {
			number = number/2;
		}
		
		if(number == 1 )
			flag = true;
		else
			flag =  false;
			
		return flag;
	}

}