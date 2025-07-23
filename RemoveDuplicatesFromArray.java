package basicProgramming;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {

		int [] arr = {3,4,5,2,4,5,1,2};
		
		//Use LinkedHashSet to maintain the insertion order and remove duplicates
		LinkedHashSet <Integer> set = new LinkedHashSet<>();
		
		for(int num : arr) 
		{
			set.add(num);
		}
		
		// Convert the LinkedHashSet back to an array
		int[]result = set.stream().mapToInt(Integer :: intValue).toArray();
		System.out.println(Arrays.toString(result));
	}

}
