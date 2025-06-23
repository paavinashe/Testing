package arrays;

import java.util.Arrays;

public class CheckArraysEqual {

	public static void main(String[] args) {
		int a1[]= {1,2,19,4,5};
		int a2[]= {1,2,3,4,5};
		
		Boolean status = Arrays.equals(a1, a2);
		
		if(status==true) 
		{
			System.out.println("Arrays are equal");
		}
		else {System.out.println("Arrays are not equal");}

	}

}
