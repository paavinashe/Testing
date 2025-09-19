package javapractice;

public class ToFindSmallestElementInArray {

	public static void main(String[] args) {
		
         int[]arr = {4,5,3,6,2,7};
         
         //Assume first element to be smallest
         int smallest = arr[0];
         
         //Loop through array to find smallest
         for(int i=0;i<arr.length;i++) 
         {
        	 if(arr[i]<smallest) 
        	 {
        		 smallest = arr[i];
        	 }
         }
         System.out.println("The smallest element in the array is "+smallest);
	}

}
