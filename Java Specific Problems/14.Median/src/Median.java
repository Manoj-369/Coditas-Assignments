import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Median {

	public static void main(String[] args) {
		
		int sum = 0;
		List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2));
		List<Integer> list2 = new ArrayList<>(Arrays.asList(3,4));
		
		list1.addAll(list2);
		Collections.sort(list1);
		
		
		for(int list : list1) {
			 sum = sum + list;
		}
		
		double median = sum / list1.size();
			
		System.out.println("Merged array = "+ list1 + " and Median is = "+ median);
		

	}

}