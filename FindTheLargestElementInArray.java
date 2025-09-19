package javapractice;

public class FindTheLargestElementInArray {

	public static void main(String[] args) {
		
        //Create a simple array
		int[]arr = {5,6,4,3,7,8};
		
		//Assume first element to be largest
		int largest = arr[0];
		
		//Loop through the array to find the largest
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]>largest) 
			{
				largest = arr[i];
			}
		}
		//Print the result
		System.out.println("The largest element in the array is: "+largest);
 	}

}
