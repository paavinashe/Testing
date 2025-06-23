package arrays;

public class ToFindLargestElementInArray {
	
	// array declared
	/*static int arr[] = {34,12,56,78,23};
	
	//method to find largest in array
	 static int largest() 
	 {
		int i;
		//initialize maximum element
		int max = arr[0];
		
		//traverse array element from second 
		//and compare every element with current max
		for(i=1;i<arr.length;i++) 
		
			if (arr[i] > max)
				max = arr[i];
			return max;
		
	}*/
	/*static int a[]= {23,56,13,45};
	
	static int largest() 
	{
		int i;
		int max = a[0];
		for(i=1;i<a.length;i++)
			if(a[i] > max)
				max = a[i];
		return max;
			
	}*/
static int a[]= {56,45,67,34};
	
	static int largest() 
	{   
		int i;
		int max = a[0];
		for(i=1;i<a.length;i++)
			if(a[i] > max)
				max = a[i];
		return max;
	}

	public static void main(String[] args) {
		 
		System.out.println("The largest number in array is: " +largest());

	}

}
