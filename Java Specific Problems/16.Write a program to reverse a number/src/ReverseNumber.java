import java.util.*;

public class ReverseNumber {

	public static void main(String[] args) {

		System.out.println("Enter the number");
		
		Scanner sc =new Scanner(System.in);
		
		int number =sc.nextInt();
		
		int Reverse =0;
		while(number>0) {
			
			int last_Digit=number%10;
			Reverse =Reverse*10+last_Digit;
			number /=10;

		}
		System.out.println("The Reverse NUmber is :" + Reverse);

	}

}
