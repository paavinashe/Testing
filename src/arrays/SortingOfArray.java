package arrays;

import java.util.Arrays;

public class SortingOfArray {

	public static void main(String[] args) {
		int arr [] = {20,34,15,45,89,12,67};
		System.out.println("The original array is: ");
		for(int i:arr) 
		{
			System.out.println(i + " ");
		}
		Arrays.sort(arr);
		System.out.println("\nThe sorted array is: ");
		for(int x:arr) 
		{
			System.out.println(x +" ");
		}
		

	}

}
