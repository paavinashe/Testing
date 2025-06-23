package arrayscodingexamples;

import java.util.Arrays;

public class TocheckArraysAreEqual {

	public static void main(String[] args) 
	{
       int a1[]= {1,2,3,4};
       
       int a2[]= {1,3,4,5};
       
       boolean status = Arrays.equals(a1,a2);
       
       if(a1==a2) 
       {
    	   System.out.println("arrays are equal");
       }
       else
       {
    	   System.out.println("arrays are not equal");
       }
	}

}
