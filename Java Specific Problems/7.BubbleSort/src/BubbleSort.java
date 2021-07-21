import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter array size");
		int size = scanner.nextInt();
		
		int[] numbers = new int[size];
		System.out.println("Enter array elements");
		for(int i= 0 ;i<size;i++)
			numbers[i] = scanner.nextInt();
		
		bubbleSort(numbers);
	
		scanner.close();

	}
	
	public static void bubbleSort(int[] numbers) {
		
		int temp;
		for(int i = 0;i<numbers.length;i++) {
			boolean flag=false;
			for(int j=0;j<numbers.length-1-i;j++) {
				if(numbers[j] > numbers[j+1]) {
					temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
					flag=true;
				}
			}
			if(!flag)
				break;
		}
		
		System.out.println("After Bubble sort, array is ");
		for(int i=0;i<numbers.length;i++)
			System.out.println(numbers[i]+" ");
	}

}