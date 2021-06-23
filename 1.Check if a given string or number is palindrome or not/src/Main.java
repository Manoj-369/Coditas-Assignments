import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the number");
		int number =sc.nextInt();
		
		int reverse=0;
		int new_num=number;
		
		while(new_num!=0) {
			
			reverse=reverse*10+new_num%10;
			new_num/=10;
		}
		if(number==reverse) {
			System.out.println("Palindrome Number ");
		}
		else {
			System.out.println("Not Palindrome Number");
		}
		
	}

}
