import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter array size");
		int size = scanner.nextInt();
		
		int[] numbers = new int[size];
		System.out.println("Enter array elements");
		for(int i= 0 ;i<size;i++)
			numbers[i] = scanner.nextInt();
		
		insertionSort(numbers);
	
		scanner.close();

	}
	
	public static void insertionSort(int[] numbers) {
		
		int temp,j;
		for(int i=0;i<numbers.length;i++) {
			temp =numbers[i];
			j = i;
			while(j>0 && numbers[j-1] > temp) {
				numbers[j] = numbers[j-1];
				j--;
			}
			numbers[j] = temp;
		}
		System.out.println("After Insertion sort array is ");
		for(int i=0;i<numbers.length;i++)
			System.out.println(numbers[i]);
	}

}